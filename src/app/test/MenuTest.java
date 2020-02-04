package app.test;

import app.biblioteca.Tela;;

public class MenuTest {
	public static void main(String [] args) {
		//System.out.println("quantidade de usuarios instanciados" + Usuario.getQntUsuario());

		Tela tela = new Tela();
		tela.cadastrarUsuario();
	}
}
