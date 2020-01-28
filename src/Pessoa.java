import java.util.Random;

public abstract class Pessoa{

	private final int id;
	private Enum<TipoPessoa> tipo;
	private String nome;
	private int idade;
	private int ddd;
	private int telefone;
	private Endereco endereco = new Endereco();

	public Pessoa(Enum<TipoPessoa> tipo, String nome, int idade, int ddd, int telefone) {
		this.id = geraNumeroParaCadastro();
		this.tipo = tipo;
		this.nome = nome;
		this.idade = idade;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getId() {
		return this.id;
	}

	public Enum<TipoPessoa> getTipo() {
		return tipo;
	}

	public String getNumeroDoTelefone() {
		return "("+ddd+") " + telefone;
	}

	public String enderecoCadastrado() {
		return endereco.toString();
	}
	
	public void informarEndereco(String nomeDaRua, int numero, String bairro, String cidade, String estado) {
		endereco.cadastrarEndereco(nomeDaRua, numero, bairro, cidade, estado);
	}

	private int geraNumeroParaCadastro() {
		Random gerador = new Random();
		return gerador.nextInt(50); 
	}
	
	@Override
	public String toString() {
		return "O nome da pessoa cadastrada é: " + this.nome + " e sua idade é: " + this.idade;
	}

	public String tipoPessoa() {
		// TODO Auto-generated method stub
		return null;
	}

}
