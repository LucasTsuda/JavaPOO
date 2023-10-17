package javaAcademico;
import java.util.ArrayList;

public class controlaAluno {
	
	//DECLARANDO OBJETO ARRAY LIST DA CLASSE ALUNO
	
	private ArrayList<Aluno> alunos = new ArrayList<>();

		
	//PUXANDO O METODO LISTARTODOS DA CLASSE INTERFACE
	
	public ArrayList<Aluno> listarTodos() {
		return this.alunos;
	}
		
	// CADASTRA ALUNOS
	
	public boolean cadastrarAluno(Aluno aluno) {
		
		//VERIFICA SE TEM ALGUM VALOR NO ARRAYLIST
		
		
		
		boolean alunoExistente = verificarAlunoExistente(aluno);

		if (alunoExistente) {
			return false;           // NAO DEU PARA CADASTRAR
		} else {			
			this.alunos.add(aluno); // CADASTRA UM ALUNO ADICIONANDO O OBJETO NO ARRAYLIST
			return true;
		}
	}
	
	// FUNÇÃO INTERNA QUE VERIFICA SE UM ALUNO JA EXISTE COM O MESMO CODIGO
	
	public boolean verificarAlunoExistente(Aluno aluno) {
		for (Aluno alu: alunos) {
			if (alu.equals(aluno)) {
				return true;
			}
		}
		return false;
	}	
		
	// METODO QUE BUSCA O CODIGO DIGITADO NO ARRAYLIST 
	
	public Aluno buscaAlunoCodigo(int codigo_busca) {
		 for (Aluno aluno : alunos) {
		     if (aluno.getCodigo() == codigo_busca) {
		         return aluno; // RETORNA O ALUNO ENCONTRADO
		     }
		 }
		 return null; // RETORNA NUL SE NENHUM ALUNO FOR ENCONTRADO
	}
		
	public boolean removeAlunoCodigo(int codigo_busca) {
		for (Aluno aluno : alunos) {
	        if (aluno.getCodigo() == (codigo_busca)) {
	            alunos.remove(aluno);
	            return true; // retorna o aluno encontrado
	        }
	    }
	     return false;
	}
	
}
