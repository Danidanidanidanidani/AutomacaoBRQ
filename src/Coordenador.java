
public class Coordenador extends Funcionarios implements Cadastrar{

	public Coordenador (String nome, int idade, int ddd, int telefone, double salario, String cargo) {
		super(TipoPessoa.Coordenador, nome, idade, ddd, telefone, salario, cargo);
	}

	private String relatorio;
	
	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}

	@Override
	public double salarioBonificado() {
		double nvSalario = super.getSalario() * 0.2;
		return super.getSalario() + nvSalario;
	}
}
