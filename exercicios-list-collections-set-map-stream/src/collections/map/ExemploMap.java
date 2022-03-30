package collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
/*		Para os modelos dos carros e seus repectivos cosumos na estrada, faça:
		modelo = gol -  consumo = 14,4lm/l
		modelo = uno -  consumo = 15,6lm/l
		modelo = mobi -  consumo = 16,1lm/l
		modelo = hb20 -  consumo = 14,5lm/l
		modelo = kwid -  consumo = 15,6lm/l
		*/
		
		//Crie um dicionario que relacione os modelos e seus respectivos consumos
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		System.out.println(carrosPopulares);
		System.out.println(carrosPopulares.toString());
		
		//Substitua o consumo do gol por 15,2 km/l
		System.out.println("Substitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		//Confira se o modelo Tucson está no dicionario
		System.out.println("Confira se o modelo Tucson está no dicionario: " 
				+ carrosPopulares.containsKey("tucson")
		);
		
		//Exiba o consumo do uno
		System.out.println("Exiba o consumo do uno: "
				+ carrosPopulares.get("uno"));
		
		//Exiba o terceiro modelo adicionado
//MAP não tem essa funcionalidade
		
		//Exiba os modelos
		Set<String> modelos = carrosPopulares.keySet();
//		carrosPopulares.keySet(); retorna um SET
		System.out.println("Exiba os modelos: " + modelos);
		
		//Exiba os consumos dos carros
		Collection<Double> values = carrosPopulares.values();
//		carrosPopulares.values(); retorna uma collection de valores
		System.out.println("Exiba os consumos dos carros: " + values);
		
		//Exiba o modelo mais econimico e seu consumo
		
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
//		carrosPopulares.entrySet(); retorna SET e os elementos dentro deles são do tipo ENTRY
		
		String modeloMaisEficiente = "";
		for(Map.Entry<String, Double> entry: entries) {
			if (entry.getValue().equals(consumoMaisEficiente))
				modeloMaisEficiente = entry.getKey();
		}
		
		System.out.println("Modelo mais eficiente: " 
							+ modeloMaisEficiente +" - " 
							+ consumoMaisEficiente);
		
		
		//Exiba o modelo menos econimico e seu consumo
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals((consumoMenosEficiente)))
					modeloMenosEficiente = entry.getKey();
		}
		
		
		System.out.println("Modelo menos eficiente: " 
				+ modeloMenosEficiente +" - " 
				+ consumoMenosEficiente);
		
		//Exiba a soma dos consumos
		carrosPopulares.values().iterator();// esse retorno é o collections
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Soma dos consumos: " +  soma);
		
		//Exiba a media dos consumos
		Double media = soma / carrosPopulares.size();		
		System.out.println("Media dos consumos: " +  media);
		
		
		System.out.println(carrosPopulares);
		System.out.println("Remova os modelos com consumo igual a 15,6 km/l");
		//Remova os modelos com consumo igual a 15,6 km/l
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6))
				iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		
//		Exiba todos os carros na ordem em que foram informados:
		System.out.println("Carros na ordem que foram informados");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		System.out.println(carrosPopulares1);
		
//		Exiba o dicionario ordenado pelo modelo
		System.out.println("Carros ordenados pelo modelo");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2.toString());
		
		
//		Apague os dicionarios de carros
		System.out.println("Apague os dicionarios de carros");
		carrosPopulares.clear();
		
//		Confira se o dicionario está vazio
		System.out.println(carrosPopulares.isEmpty());
		
		}
	
	
		
	}

