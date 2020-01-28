
public class Endereco {

	private String logradouro;
	private int numeroLogradouro;
	private String bairro;
	private String cidade;
	private String estado;

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void cadastrarEndereco(String nomeDaRua, int numero, String bairro, String cidade, String estado) {
		this.logradouro = nomeDaRua;
		this.numeroLogradouro = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Logradouro: " + this.logradouro + "número: " + this.numeroLogradouro + " bairro: " + this.bairro
				+ " na cidade: " + this.cidade + " no estado de: " + this.estado;
	}
}
