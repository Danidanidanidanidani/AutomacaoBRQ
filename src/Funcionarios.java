
public abstract class Funcionarios extends Pessoa {

	public Funcionarios(Enum<TipoPessoa> tipo, String nome, int idade, int ddd, int telefone, double salario, String cargo) {
		super(tipo, nome, idade, ddd, telefone);
		this.cargo = cargo;
		this.salario = salario;
	}

	private String cargo;
	private double salario;
	private int setor;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
}
