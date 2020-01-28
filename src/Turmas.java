import java.util.List;

public class Turmas {

	private List<Alunos> alunos;
	private List<Professores> professor;
	private String periodo;
	private String sala;
	private String semestre;

	public Turmas(List<Alunos> alunos, List<Professores> professor, String periodo, String sala, String semestre) {
		this.alunos = alunos;
		this.professor = professor;
		this.periodo = periodo;
		this.sala = sala;
		this.semestre = semestre;
	}


	public List<Alunos> getAlunos() {
		return alunos;
	}

	public List<Professores> getProfessor() {
		return professor;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getSala() {
		return sala;
	}

	public String getSemestre() {
		return semestre;
	}

	@Override
	public String toString() {
		return "O aluno cadastrado na turma: " + this.alunos + " e o professor da turma é:" + this.professor
				+ " no periodo: " + this.periodo + " na sala: " + this.sala;
	}

}
