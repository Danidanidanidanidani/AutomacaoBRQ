public class Alunos extends Pessoa{

	public Alunos(String nome, int idade, int ddd, int telefone) {
		super(TipoPessoa.Aluno,nome, idade, ddd, telefone);
	}

	private int matricula = super.getId();
	private double nota;
	private int qtdNotas;

	public final int informaMatricula() {
		return this.matricula;
	}

	public double getNota() {
		return nota;
	}

	public void informarNota(double nota) {
		this.nota += nota;
		this.qtdNotas ++;
	}

	public double mediaDoAluno() {
		return this.nota/qtdNotas;
	}
	
	@Override
	public String toString() {
		return super.getNome() + " e sua idade é: " + super.getIdade();
	}
}
