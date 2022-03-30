package collections.map;

import java.util.*;
import java.util.Map.Entry;

/* Dadas as seguintes informaçoes sobre meus livros favoritos e seus autores,
crie um dicionario e ordene este dicionario:
exibindo(Nome Autor - Nome Livro)

Autor = Hawking, Stephen - livro =  nome: Uma Bree Historia do Tempo. Paginas: 256
Autor = Duhigg, Charles - livro =  nome: O Poder do Habito. Paginas: 408
Autor = Harari, Yuval Noah - livro =  nome: 21 liçoes para o seculo 21. Paginas: 432

*/

public class ExemploOrdenacaoMap {

	public static void main(String[] args) {

//		ORDEM ALEATORIA = HASHMAP
		System.out.println("--\tOrdem Aleatoria\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			
			put("Hawking, Stephen", new Livro("Uma Bree Historia do Tempo", 500));
			put("Duhigg, Charles", new Livro(" O Poder do Habito", 408));
			put("Harari, Yuval Noah", new Livro("21 liçoes para o seculo 21", 432));
			
		}};

		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() +  " - " + livro.getValue().getNome());
		
//		ORDEM DE INSERÇÃO = LINKED HAS MAP
		System.out.println("--\tOrdem Inserção\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			
			put("Hawking, Stephen", new Livro("Uma Bree Historia do Tempo", 500));
			put("Duhigg, Charles", new Livro(" O Poder do Habito", 408));
			put("Harari, Yuval Noah", new Livro("21 liçoes para o seculo 21", 432));
			
		}};
		
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() +  " - " + livro.getValue().getNome());
		
		
		
//	ORDEM ALFABETICA DOS AUTORES = TREEMAP
	System.out.println("--\tOrdem Alfabetica dos autores\t--");
	Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1) {{
		
	}};
	
	for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
		System.out.println(livro.getKey() +  " - " + livro.getValue().getNome());
	
	
//	ORDEM ALFABETICA DOS LIVROS
	System.out.println("--\tOrdem Alfabetica dos Livros\t--");
	Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
	meusLivros3.addAll(meusLivros.entrySet());
//	System.out.println(meusLivros3);
	for (Map.Entry<String, Livro> livro : meusLivros3)
		System.out.println(livro.getKey() +  " - " + livro.getValue().getNome());
	
	
//	ORDEM ALFABETICA DOS PAGINAS
	System.out.println("--\tOrdem Alfabetica dos paginas\t--");
	Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
	meusLivros4.addAll(meusLivros.entrySet());
//	System.out.println(meusLivros3);
	for (Map.Entry<String, Livro> livro : meusLivros4)
		System.out.println(livro.getKey() +  " - " + livro.getValue().getNome());
	
	}
}


class Livro{
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}
	
//	Como vou trabalhar com HASHMAP, TREEMAP e LINKEDHASHMAP vou reescrever os metodos EQUALS e HASHCODE
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Livro livro = (Livro) o;
		return nome.equals(livro.nome) && paginas.equals(livro.paginas);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}
	
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
	
}
	

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
	}
	
	
}

	
