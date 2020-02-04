package app.biblioteca;

public interface IUsuario {

	long TIME_OUT = 10000000;
	
	
	boolean logar(String login, String senha);
	boolean deslogar();
	String getLogin();
	boolean alterarLogin(String login);
	boolean alterarSenha(String senha, String novaSenha);
	boolean isLogado();

}
