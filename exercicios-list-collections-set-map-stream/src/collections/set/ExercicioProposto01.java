package collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto01 {

	public static void main(String[] args) {
		
		Set<String> coresArcoiris = new HashSet<>();
		coresArcoiris.add("Vermelho");
		coresArcoiris.add("Azul");
		coresArcoiris.add("Amarelo");
		coresArcoiris.add("Verde");
		coresArcoiris.add("Roxo");
		coresArcoiris.add("Laranjado");
		coresArcoiris.add("Anil");
		
		System.out.println(coresArcoiris);
		
		for(String cor : coresArcoiris )
			System.out.println(cor);
		
		System.out.println("Quantidade cores arcoriris: ");
		System.out.println(coresArcoiris.size());
		
		System.out.println("Cores em ordem alfabetica: ");
		Set<String> coresArcoirisord = new TreeSet<>(coresArcoiris);
		System.out.println(coresArcoirisord);
		
//		inverter a lista de corer
		System.out.println("Cores em ordem inversa: ");
		Set<String> coresArcoirisinv = new LinkedHashSet<>(
				Arrays.asList("Vermelho", "Azul", "Amarelo", "Verde", "Roxo", "Laranjado", "Anil"));
		 List<String> coresArcoIrisList = new ArrayList<>(coresArcoirisinv);
		 Collections.reverse(coresArcoIrisList);
		 System.out.println(coresArcoIrisList);
		 
//		 imprimir cores que começam com V
		 for(String cor : coresArcoiris )
			 if(cor.startsWith("v") || cor.startsWith("V") )
				System.out.println(cor);
		 
//		  remover cores que NÃO começam com v
		 Iterator<String> iterator1 = coresArcoiris.iterator();
		 while(iterator1.hasNext()) {
			 String next = iterator1.next();
			 if (!next.startsWith("V"))
			 iterator1.remove();
		 }
		 
		 System.out.println(coresArcoiris);
		 
//		 limpe o conjunto
		 coresArcoiris.clear();
		 System.out.println(coresArcoiris);
		 
//		 cofira se o cojunto está vazio
		 if (coresArcoiris.isEmpty())
			 System.out.println("Está vazio");
		 
		 
		 
			
	}

}
