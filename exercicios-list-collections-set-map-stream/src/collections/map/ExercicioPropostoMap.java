package collections.map;

import java.util.*;
import java.util.Map.Entry;

public class ExercicioPropostoMap {

	public static void main(String[] args) {
		
		
//		DADA A POPULA��O ESTIMADA DE ALGUNS ESTADOS DO NORDESTE CRIE UM DICIONARIO 
//		RELACIONE OS ESTADOS E SUA POPULA�OES
		
		Map<String, Integer> populacaoEstadosNordeste = new HashMap<>() {{
			
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			
			
	}};
	
	System.out.println("Estados Nordestes e suas Popula�oes");
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Substitua a popula��o do RN por 3534165");
	populacaoEstadosNordeste.put("RN", 3534165);
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Confira se o estado da PB est� no dicionario, caso adiciona com 4039277");
	if (populacaoEstadosNordeste.containsKey("PB") == false ) 
		populacaoEstadosNordeste.put("PB", 4039277);
	
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Exiba a popula��o de PB " + populacaoEstadosNordeste.get("PB"));
	
//	EXIBA NA ORDEM QUE FOI ADICIONADO
	System.out.println("Exiba na ordem que foi informado");
	Map<String, Integer> populacaoEstadosNordeste1 = new LinkedHashMap<>() {{
		put("PE", 9616621);
		put("AL", 3351543);
		put("CE", 9187103);
		put("RN", 3534265);
		
}};

System.out.println(populacaoEstadosNordeste1);

//EXIBA NA ORDEM ALFABETICA
	System.out.println("Exiba na ordem Alfabetica");
	Map<String, Integer> populacaoEstadosNordeste2 = new TreeMap<>(populacaoEstadosNordeste1);
	System.out.println(populacaoEstadosNordeste2);
	
	System.out.println("Exiba o Estado com a menor Popula��o e sua quantidade");
	Integer menorPopulacao = Collections.min(populacaoEstadosNordeste.values());
	String estadoMenorPop = "";
	for(Map.Entry<String, Integer> entry: populacaoEstadosNordeste.entrySet()) {
		if (entry.getValue().equals(menorPopulacao))
			estadoMenorPop = entry.getKey();
	}

	System.out.println("Estado com a menor Popula��o: " 
			+ estadoMenorPop +" - " 
			+ menorPopulacao);
	
	System.out.println("Exiba o Estado com a maior Popula��o e sua quantidade");
	Integer maiorPopulacao = Collections.max(populacaoEstadosNordeste.values());
	String estadoMaiorPop = "";
	for(Map.Entry<String, Integer> entry: populacaoEstadosNordeste.entrySet()) {
		if (entry.getValue().equals(maiorPopulacao))
			estadoMaiorPop = entry.getKey();
	}

	System.out.println("Estado com a maior Popula��o: " 
			+ estadoMaiorPop +" - " 
			+ maiorPopulacao);

//	EXIBA A SOMA DA POPULA��O DOS ESTADOS
	populacaoEstadosNordeste.values().iterator();
	Iterator<Integer> iterator = populacaoEstadosNordeste.values().iterator();
	Integer soma = 0;
	while (iterator.hasNext()) {
		soma += iterator.next();
	}
	System.out.println("Soma das popula�oes: " +  soma);

//EXIBA A MEDIA DA POPULA��O
	Double media = (double) (soma / populacaoEstadosNordeste.size());
	System.out.println("Media das popula�oes: " +  media);
	
// REMOVA OS ESTADOS COM POPULA��O MENOR QUE 4000000
 Iterator<Integer> iterator1 = populacaoEstadosNordeste.values().iterator();
 while(iterator1.hasNext()) {
	 if(iterator1.next() < 4000000)
		 iterator1.remove();
 }
 System.out.println(populacaoEstadosNordeste);
 
// APAGUE O DICIONARIO
 System.out.println("Apague os dicionarios");
 populacaoEstadosNordeste.clear();
 
//	Confira se o dicionario est� vazio~
 System.out.println("Confira se est� vazio");
	System.out.println(populacaoEstadosNordeste.isEmpty());
	
}
}
