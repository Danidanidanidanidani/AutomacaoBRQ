
public enum TipoPessoa {
	
	Aluno(1), Professor(2), Coordenador (3);
	
	private final int tipo;
	
	private TipoPessoa(int valor) {
		this.tipo = valor;
	}
	
	public int getTipo() {
		return tipo;
	}
}
