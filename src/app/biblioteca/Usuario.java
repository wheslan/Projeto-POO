package app.biblioteca;

public class Usuario extends Pessoa implements IUsuario {

	private String login;
	private String senha;
	private boolean logado;
	
	public Usuario(String nome, String dataNasc, String cpf, String login, String senha) {
		super(nome, dataNasc, cpf);
		this.login = login;
		this.senha = senha;	
		this.logado = false;
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean logar(String login, String senha) {
		if(this.login.equals(login) && this.senha.equals(senha)) {
			logado = true;

			return true;
		}
		return false;
	}

	@Override
	public boolean deslogar() {
		if(logado) {
			logado = false;

			return true; 
		}

		return false;
	}
	private boolean isLoginValido(String login) {
		if(!login.equals("") && !login.equals(" ")) {
			return true;
		}

		return false;
	}



	@Override
	public boolean alterarLogin(String login) {
		if(logado && isLoginValido(login)) {
			this.login = login;
			return true;
		}
		return false;

	}
	public boolean isSenhaValida(String senha) {
		if(!senha.equals("") && !senha.equals(" ")) {
			return true;
		}
		return false;
	}
	@Override
	public boolean alterarSenha(String senha, String novaSenha) {
		if(logado && this.senha.equals(senha) && isSenhaValida(novaSenha))  {
			this.senha = novaSenha;

			return true;
		}
		return false;
	}

	@Override
	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	
}
