package javaAcademico;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		Interface inter = new Interface();
		controlaAluno controlaAluno = new controlaAluno();
		
		int opMenu = inter.menuPrincipal();
		
		while(opMenu != 5) {
			
			switch (opMenu) {
			case 1: {
				
				// INSTANCIANDO ALUNO DA CLASSE ALUNO
				// novoAluno é METODO DA CLASSE Interface 
				
				Aluno Aluno = inter.novoAluno();
				
				if(controlaAluno.cadastrarAluno(Aluno)) {
					inter.mostraMensagem("Aluno Cadastrado com sucesso!");
					inter.mostraAluno(Aluno);
				}else {
					inter.mostraMensagem("Aluno não cadastrado!");
					inter.mostraAluno(Aluno);
				}
				break;
			}
			case 2: {
				
				// LISTA ALUNOS CADASTRADOS
				
				ArrayList<Aluno> alunosCadastrados = controlaAluno.listarTodos();
				inter.mostraMensagem("Listar alunos cadastrados");
				inter.listaAluno(alunosCadastrados);
				break;
			}
			case 3: {
				
				//BUSCA ALUNOS CADASTRADOS
				
				int codigo_busca = inter.lerCodigoAluno();
				Aluno aluno_busca = controlaAluno.buscaAlunoCodigo(codigo_busca);
				
				if(aluno_busca == null) {
					inter.mostraMensagem("Aluno com código " + codigo_busca + " não encontrado");
				}else {
					inter.mostraMensagem("Aluno cadastrado");
					inter.mostraAluno(aluno_busca);
				}
				break;
			}
			case 4: {
				
				//REMOVE ALUNO  
				
				int codigo_remove = inter.lerCodigoAluno();
				boolean codigo_aluno = controlaAluno.removeAlunoCodigo(codigo_remove);
				
				if (codigo_aluno) {
					inter.mostraMensagem("O aluno do codigo " + codigo_remove + " foi removido da base");
				} else {
					inter.mostraMensagem("O aluno não foi encontrado");
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opMenu);
			}
			
			opMenu = inter.menuPrincipal();
		}
		
	}
	
	
	
}
