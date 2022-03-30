package collections.map;

import java.util.*;
import java.util.Map.Entry;

public class ExercicioPropostoMap {

	public static void main(String[] args) {
		
		
//		DADA A POPULAÇÃO ESTIMADA DE ALGUNS ESTADOS DO NORDESTE CRIE UM DICIONARIO 
//		RELACIONE OS ESTADOS E SUA POPULAÇOES
		
		Map<String, Integer> populacaoEstadosNordeste = new HashMap<>() {{
			
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			
			
	}};
	
	System.out.println("Estados Nordestes e suas Populaçoes");
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Substitua a população do RN por 3534165");
	populacaoEstadosNordeste.put("RN", 3534165);
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Confira se o estado da PB está no dicionario, caso adiciona com 4039277");
	if (populacaoEstadosNordeste.containsKey("PB") == false ) 
		populacaoEstadosNordeste.put("PB", 4039277);
	
	System.out.println(populacaoEstadosNordeste);
	
	System.out.println("Exiba a população de PB " + populacaoEstadosNordeste.get("PB"));
	
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
	
	System.out.println("Exiba o Estado com a menor População e sua quantidade");
	Integer menorPopulacao = Collections.min(populacaoEstadosNordeste.values());
	String estadoMenorPop = "";
	for(Map.Entry<String, Integer> entry: populacaoEstadosNordeste.entrySet()) {
		if (entry.getValue().equals(menorPopulacao))
			estadoMenorPop = entry.getKey();
	}

	System.out.println("Estado com a menor População: " 
			+ estadoMenorPop +" - " 
			+ menorPopulacao);
	
	System.out.println("Exiba o Estado com a maior População e sua quantidade");
	Integer maiorPopulacao = Collections.max(populacaoEstadosNordeste.values());
	String estadoMaiorPop = "";
	for(Map.Entry<String, Integer> entry: populacaoEstadosNordeste.entrySet()) {
		if (entry.getValue().equals(maiorPopulacao))
			estadoMaiorPop = entry.getKey();
	}

	System.out.println("Estado com a maior População: " 
			+ estadoMaiorPop +" - " 
			+ maiorPopulacao);

//	EXIBA A SOMA DA POPULAÇÃO DOS ESTADOS
	populacaoEstadosNordeste.values().iterator();
	Iterator<Integer> iterator = populacaoEstadosNordeste.values().iterator();
	Integer soma = 0;
	while (iterator.hasNext()) {
		soma += iterator.next();
	}
	System.out.println("Soma das populaçoes: " +  soma);

//EXIBA A MEDIA DA POPULAÇÃO
	Double media = (double) (soma / populacaoEstadosNordeste.size());
	System.out.println("Media das populaçoes: " +  media);
	
// REMOVA OS ESTADOS COM POPULAÇÃO MENOR QUE 4000000
 Iterator<Integer> iterator1 = populacaoEstadosNordeste.values().iterator();
 while(iterator1.hasNext()) {
	 if(iterator1.next() < 4000000)
		 iterator1.remove();
 }
 System.out.println(populacaoEstadosNordeste);
 
// APAGUE O DICIONARIO
 System.out.println("Apague os dicionarios");
 populacaoEstadosNordeste.clear();
 
//	Confira se o dicionario está vazio~
 System.out.println("Confira se está vazio");
	System.out.println(populacaoEstadosNordeste.isEmpty());
	
}
}
