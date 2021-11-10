package trabalho;

public class Aluno {
	   Integer matricula;
	   String nome;
	   DataPadraoBrasil dataDeNascimento;
	   
	public Aluno(Integer matricula, String nome, DataPadraoBrasil dataDeNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public String toString() {
		return "O nome do aluno é "+nome+"\n"+"matricula: "+matricula+"\n"+"Nasceu em "+dataDeNascimento;
	}
	
	   
}


