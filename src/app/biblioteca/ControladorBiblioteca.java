package app.biblioteca;

import java.util.ArrayList;

public class ControladorBiblioteca {
	private ArrayList<IUsuario> usuarios;
	private IUsuario usuariologado;
	
public void view(){
	usuarios = new ArrayList<IUsuario>();
	usuariologado = null;
}
public boolean logar(String login, String senha) {
	for(IUsuario usuario:usuarios) {
		if(usuario.logar(login,senha)) {
			usuariologado = usuario;
			return true;
		}
	}
	return false;
}
public boolean deslogar() {
	if(usuariologado != null) {
		usuariologado.deslogar();
		usuariologado = null;
		
		return true;
	}
	
	return false;
}

public boolean adicionarUsuario(IUsuario usuario) {
	if(usuario != null) {
		usuarios.add(usuario);
		
		return true;
	}
	
	return false;
}

public void listarUsuarios() {
	for (int i = 0; i < usuarios.size(); i++) {
		IUsuario usuario = usuarios.get(i);
		
		System.out.println(usuario);
	}
}

public IUsuario buscarUsuario(String login) {
	for (IUsuario usuario : usuarios) {
		if(usuario.getLogin().equals(login)) {
			return usuario;
		}
	}
	
	return null;
}

public boolean removerUsuario(IUsuario usuario) {
	if(usuario != null) {
		usuarios.remove(usuario);
		return true;
	}
	
	return false;
}


public boolean alterarUsuario(String login, String senha, String novoLogin, String novaSenha) {
	IUsuario usuario = buscarUsuario(login);
	
	boolean alterouLogin = usuario.alterarLogin(novoLogin);
	boolean alterouSenha = usuario.alterarSenha(senha, novaSenha);
	
	return alterouLogin && alterouSenha;
}
}
	
	
	
