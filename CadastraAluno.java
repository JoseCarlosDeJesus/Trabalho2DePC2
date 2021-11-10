package trabalho;

import javax.swing.JOptionPane;

public class CadastraAluno {
	   
	 public static void main(String[] args) {
		    int n;
		    n= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		    Aluno a[]= new Aluno[n];
		    Integer matricul;
		    Integer nota;
		    String nome;
		    String dia;
		    String mes;
		    String ano;
		    int i=0;
		    do{
		    	matricul= Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula,digite 0 para sair: "));
		    	if(matricul==0) {
		    		break;
		    	}
		    	nota= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
		    	nome= JOptionPane.showInputDialog("Digite o nome: ");
		    	dia= JOptionPane.showInputDialog("Digite o dia: ");
		    	mes= JOptionPane.showInputDialog("Digite o mês: ");
		    	ano= JOptionPane.showInputDialog("Digite o ano: ");
	            DataPadraoBrasil data= new DataPadraoBrasil(dia, mes, ano);
	            a[i]= new Aluno(matricul,nome,data);
	            JOptionPane.showMessageDialog(null, "A nota do Aluno "+a[i].nome+" foi "+nota);
	            JOptionPane.showMessageDialog(null, a[i]);
	            i++;    
		    }while(matricul!=0 && n!=0 && i!=n);
		    
		    JOptionPane.showMessageDialog(null,"A quantidade de alunos inseridos foi "+i);
	 }

}
