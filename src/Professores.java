
public class Professores extends Funcionarios implements Cadastrar{

	public Professores(String nome, int idade, int ddd, int telefone, double salario, String cargo) {
		super(TipoPessoa.Professor, nome, idade, ddd, telefone, salario, cargo);
	}

	private String materia;
	private int aulas;
		
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getAulas() {
		return aulas;
	}

	public void setAulas(int aulas) {
		this.aulas = aulas;
	}

	@Override
	public double salarioBonificado() {
		double nvSalario = super.getSalario() * 0.1;
		return super.getSalario()+nvSalario;
	}
	
	@Override
	public String toString() {
		return super.getNome() + " sua idade:" + super.getIdade();
	}

}