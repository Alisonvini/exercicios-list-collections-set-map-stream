package collections.map;

import java.util.*;

/*
Façaa um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class ExercicioProposto02 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int upperbound = 6;
		
		int lancDados[] = new int[100];
		
		for (int i = 0; i < 100 ; i++)
			lancDados[i] = rand.nextInt(upperbound);
//		
		 Map<Integer, Integer> lancamentos = new HashMap<>();
		for (int i = 0; i < 100 ; i++)
			if (lancamentos.containsKey(lancDados[i])) //verifica se hash contem o valor de lançamento do dado
				lancamentos.put(lancDados[i], (lancamentos.get(lancDados[i]) + 1));//se sim, o valor recebe + 1 em sua contagem 
				else lancamentos.put(lancDados[i], 1);//caso contrário é contado 1
			
		 System.out.println("\nValor " + " Quant. de vezes");
	        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
	            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
	        }

		

	}

}
