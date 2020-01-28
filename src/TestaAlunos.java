import java.util.ArrayList;

public class TestaAlunos {

	public static void main(String[] args) {
		ArrayList<Alunos> aluno = new ArrayList<>();
		ArrayList<Professores> professor = new ArrayList<>();
	
		Alunos alunos = new Alunos("Joaozinho", 27, 11, 976301416);
		alunos.informarEndereco("Rua Boa Vista", 254, "Centro Histórico", "São Paulo", "São Paulo");
		alunos.informarNota(5.5);
		alunos.informarNota(7.5);
		aluno.add(alunos);
		
		Alunos alunos2 = new Alunos("Abud", 27, 11, 976301416);
		alunos2.informarEndereco("Rua Boa Vista", 254, "Centro Histórico", "São Paulo", "São Paulo");
		alunos2.informarNota(5.5);
		alunos2.informarNota(7.5);
		aluno.add(alunos2);
	
		
		Professores professores = new Professores("Vioti", 62, 11, 911234569, 3500d, "Professor Nivel 1");
		professores.informarEndereco("Rua Boa Vista", 254, "Centro Histórico", "São Paulo", "São Paulo");
		professores.setAulas(4);
		professores.setMateria("Geografia");
		professor.add(professores);
		
		Professores professores2 = new Professores("Queria ter essa experiência", 62, 11, 911234569, 4000d, "Professor Nivel 2");
		professores2.informarEndereco("Rua Boa Vista", 254, "Centro Histórico", "São Paulo", "São Paulo");
		professores2.setAulas(4);
		professores2.setMateria("Educação Física");
		professor.add(professores2);

		Turmas turmas = new Turmas(aluno, professor, "Manhã", "Sala 2", "1");
		turmas.getAlunos().forEach(a -> System.out.println("O aluno -> " + a.getNome() + " estuda no periodo -> "+ turmas.getPeriodo()));
		turmas.getProfessor().forEach(p -> System.out.println("O professor -> " + p.getNome() + " aplica a aula na sala -> "+ turmas.getSala()));

	}

}