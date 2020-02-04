package app.biblioteca;

public class Pessoa {

	private String nome;
	private String dataNasc;
	private String cpf; 
	public Pessoa(String nome, String dataNasc, String cpf) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
