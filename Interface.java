package javaAcademico;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
	
	Scanner scan = new Scanner(System.in);
	
	// CRIANDO O METODO MENU
	
	public int menuPrincipal() {
		System.out.println("------------------------------------");
		System.out.println("------------   MENU   --------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Listar Aluno");
		System.out.println("3 - Procurar Aluno por Código");
		System.out.println("4 - Excluir");
		System.out.println("5 - Sair");
		
		int alternativa = scan.nextInt();
		
		while (alternativa > 5 || alternativa <= 0) {

			System.out.println("------------------------------------");
			System.out.println("------------   MENU   --------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Listar Aluno");
			System.out.println("3 - Procurar Aluno por Código");
			System.out.println("4 - Excluir");

			System.out.println("5 - SAIR ");
			alternativa = scan.nextInt();

		}
		return alternativa;
	}
	
	// METODO QUE LE O CODIGO DO ALUNO
	
		public int lerCodigoAluno() {
			System.out.println("Qual é o codigo?");
			int codigo = scan.nextInt();
			return codigo;
		}

		// METODO QUE LE O SEXO DO ALUNO
		
		public int lerSexoAluno() {
			System.err.println("Qual é o sexo? 1 - Masculino / 2 - Feminino");
			int sexo = scan.nextInt();
			scan.nextLine();
			return sexo;
		}
		
		// METODO QUE LE O NOME DO ALUNO
		
		public String lerNomeAluno() {
			System.err.println("Qual é o nome é sobrenome?");
			String nome = scan.nextLine();
			return nome;
		}
		
		// METODO QUE LE O EMAIL DO ALUNO
		
		public String lerEmailAluno() {
			System.err.println("Qual é o email?");
			String email = scan.nextLine();
			return email;
		}
		
		// METODO QUE LE O PESO DO ALUNO
		
		public double lerPesoAluno() {
			System.err.println("Qual é o peso?");
			double peso = scan.nextDouble();
			return peso;
		}
		
		// METODO QUE LE O ALTURA DO ALUNO
		
		public double lerAlturaAluno() {
			System.err.println("Qual é altura?");
			double altura = scan.nextDouble();
			return altura;
		}
		
		// METODO QUE MOSTRA UM ALUNO EM TOSTRING
		
		public void mostraAluno(Aluno aluno) {
			System.out.println(aluno.toString());
		}
		
		// METODO QUE CADASTRA ALUNO
		
		public Aluno novoAluno() {
			
			int codAluno;
			int sexoAluno;
			String nomeAluno;
			String emailAluno;
			double pesoAluno;
			double alturaAluno;
			
			// MANDA PARA O METODO LER CODIGO DESSA CLASSE
			codAluno = lerCodigoAluno();
			while (codAluno <= 0) {
				codAluno = lerCodigoAluno();  
			}
			
			// MANDA PARA O METODO LER SEXO DESSA CLASSE
			sexoAluno = lerSexoAluno();
			while ((sexoAluno != 1) && (sexoAluno != 2)) {
				sexoAluno = lerSexoAluno();  
			}
			
			// MANDA PARA O METODO LER NOME DESSA CLASSE
			nomeAluno = lerNomeAluno();
			while (nomeAluno.indexOf(' ') == -1) {
				nomeAluno = lerNomeAluno();  
			}
			
			//MANDA PARA O METODO LER EMAIL DESSA CLASSE
			emailAluno = lerEmailAluno();
			while (emailAluno.indexOf('@') == -1) {
				emailAluno = lerEmailAluno();   
			}
			
			//MANDA PARA O METODO LER PESO DESSA CLASSE
			pesoAluno = lerPesoAluno();
			while (pesoAluno <= 0) {
				pesoAluno = lerPesoAluno();
			}
			
			//MANDA PARA O METODO LER ALTURA DESSA CLASSE
			
			alturaAluno = lerAlturaAluno();
			while (alturaAluno <= 0) {
				alturaAluno = lerAlturaAluno();
			}
			
			//INSTANCIA UM OBJETO ALUNO DA CLASSE ALUNO QUE RECEBE OS DADOS OBTIDOS ACIMA
			
			Aluno alunos = new Aluno(codAluno,nomeAluno,emailAluno,pesoAluno,alturaAluno,sexoAluno);
			
			
			// RETORNA O OBJETO DO ALUNO
			return alunos;
			
		}
		
		// METODO QUE BUSCA O METODO LISTA ALUNO NA CLASSE controlaAluno
		
		public void listaAluno(ArrayList<Aluno>alunos) {
			// MOSTRA OS ALUNOS ADICIONADOS NO array list
			for(Aluno aluno : alunos) {
				System.out.println(aluno.toString());
			}
		}
		
		// METODO QUE MOSTRA UMA MENSAGEM
		
		public void mostraMensagem(String msg) {
			System.out.println(msg);
		}
}
