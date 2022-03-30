package collections.set;

import java.util.*;

public class LinguagemFavorita {

	public static void main(String[] args) {
		
		 System.out.println("--\tOrdem inserçao\t--");
		Set<Linguagens> linguaFav = new LinkedHashSet<>() {{
			add(new Linguagens("Python", 1995, "IDE Python"));
			add(new Linguagens("ABAP", 1993, "SAP"));
			add(new Linguagens("C", 1983, "NoteC"));
			add(new Linguagens("Java", 1985, "Eclipse"));
			add(new Linguagens("C", 1985, "C++"));
			
		}};

		for(Linguagens linguagem : linguaFav)
			System.out.println(linguagem);
/*------------------------------------------------------------------------------------- */		
		 System.out.println("--\tOrdem natural (Nome)\t--");
		 Set<Linguagens> linguaFav2 = new TreeSet<>(linguaFav);
		 for (Linguagens linguagem: linguaFav2)
			 System.out.println(linguagem.getNome() + " - " 
					 + linguagem.getAnoDeCriacao() + " - "
					 + linguagem.getIde() + " - ");
/*------------------------------------------------------------------------------------- */
		 System.out.println("--\tOrdem Ano e Nome\t--");
		 Set<Linguagens> linguaFav3 = new TreeSet<>(new ComparatorAnoNome());
		 linguaFav3.addAll(linguaFav);
		 for (Linguagens linguagem: linguaFav3)
			 System.out.println(linguagem.getNome() + " - " 
					 + linguagem.getAnoDeCriacao() + " - "
					 +linguagem.getIde());
		 
		 /*------------------------------------------------------------------------------------- */
		 System.out.println("--\tNome,  Ano e IDE\t--");
		 Set<Linguagens> linguaFav4 = new TreeSet<>(new ComparatorNomeAnoIde());
		 linguaFav4.addAll(linguaFav);
		 for (Linguagens linguagem: linguaFav4)
			 System.out.println(linguagem.getNome() + " - " 
					 + linguagem.getAnoDeCriacao() + " - "
					 +linguagem.getIde());
	}

}


class Linguagens implements Comparable<Linguagens>{
	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	public Linguagens(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	@Override
	public String toString() {
		return "Linguagens [nome=" + nome 
				+ ", anoDeCriacao=" + anoDeCriacao 
				+ ", ide=" + ide + "]";
	}

	public int compareTo(Linguagens linguagem) {
		
		return this.getNome().compareTo(linguagem.getNome());
	}
	

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hashCode(nome);
//	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass())return false;
//		Linguagens linguagem = (Linguagens) o;
//		return nome.equals(linguagem.nome);
//	
//	}
	
}

class ComparatorIde implements Comparator<Linguagens>{

	@Override
	public int compare(Linguagens l1, Linguagens l2) {
		
		return l1.getIde().compareTo(l2.getIde());
				
	}
	
}

class ComparatorAnoNome implements Comparator<Linguagens>{

	@Override
	public int compare(Linguagens l1, Linguagens l2) {
		int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		if (ano != 0) return ano;
		
		return l1.getNome().compareTo(l2.getNome());
	}
	
}

class ComparatorNomeAnoIde implements Comparator<Linguagens>{

	@Override
	public int compare(Linguagens l1, Linguagens l2) {
		int nome = l1.getNome().compareTo(l2.getNome());
		if (nome != 0) return nome;
		
		int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		if (ano != 0) return ano;
		
		return l1.getIde().compareTo(l2.getIde());
	}
	
}