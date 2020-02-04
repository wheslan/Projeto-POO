package app.biblioteca;

import java.util.Scanner;

/**
 * Tela
 */
public class Tela {

	Scanner opcao = new Scanner(System.in);
	//instaciando um objeto do bancoDados
	BancoDados bancoDados = new BancoDados();
	Usuario usuario;

	public void exibirMenuBoasVindas() {
		System.out.println("Bem Vindo a Biblioteca Virtual ");
		System.out.println("Digite o seu Login:");
		String login=opcao.nextLine();
		System.out.println("Digite sua Senha:");
		String senha=opcao.nextLine();
		if(!usuario.logar(login, senha)) {
			System.out.println("Usuario e senha invalida !");
		}
		if(usuario.isLogado()) {
			menu();
		}
		
		
	}

	public void cadastrarUsuario() {
		System.out.println("Digite seu nome:");
		String nome = opcao.nextLine();
		System.out.println("Digite a dataNasc:");
		String dataNasc = opcao.nextLine();
		System.out.println("Digite o Cpf:");
		String cpf = opcao.nextLine();
		System.out.println("Digite o login: ");
		String login = opcao.nextLine();
		System.out.println("Digite a Senha: ");
		String senha = opcao.nextLine();
		usuario = new Usuario(nome,dataNasc,cpf,login,senha);
		
		exibirMenuBoasVindas();
	}

	public void menu(){
		System.out.println("1 - Cadastrar livro");
		System.out.println("2 - Listar livros");
		System.out.println("3 - Atualizar livro");
		System.out.println("4 - Deletar livro");
		System.out.println("Digite uma opÁ„o: ");
		//ler a opcao do usuario
		String opcaoUsuario = opcao.nextLine();

		//compara o valor que o usu√°rio digitou
		if (opcaoUsuario.equals("1")) {
			cadastraLivro();
		}else if(opcaoUsuario.equals("2")){
			listarLivro();
		}else if(opcaoUsuario.equals("3")) {
			atualizarLivro();
		}
		else if(opcaoUsuario.equals("4")) {
			deletarLivro();
		}

		menu();//chamar o menu depois do usu√°rio escolher um op√ß√£o
	}

	private void cadastraLivro(){
		//pega os dados que o usu√°rio digitou
		Scanner lerDados = new Scanner(System.in);

		//pega o dados do livro pra cadastra livro
		System.out.println("Digite o titulo");
		String titulo = lerDados.nextLine();
		System.out.println("Digite o isbn ");
		String isbn = lerDados.nextLine();
		System.out.println("Digite a Categoria");
		String categoria = lerDados.nextLine();
		System.out.println("Digite o preco ");
		String preco = lerDados.nextLine();

		//pegando o atributo da classe bando de dados
		bancoDados.cadastrarLivro(titulo, isbn, categoria,preco);
	}

	private void listarLivro(){
		bancoDados.listarLivro();
	}

	private void deletarLivro() {
		System.out.println("Digite o Isbn do livro para Deletar:");
		String isbn = opcao.nextLine();
		bancoDados.deletarLivro(isbn);
	}
	private void atualizarLivro() {
		System.out.println("Digite o Isbn para Atualizar:");
		String isbn = opcao.nextLine();
		if(bancoDados.buscarLivro(isbn)) {
			System.out.println("Digite um novo Titulo:");
			String novoTitulo = opcao.nextLine();
			System.out.println("Digite um novo isbn:");
			String novoIsbn = opcao.nextLine();
			System.out.println("Digite um nova Categoria:");
			String novaCategoria = opcao.nextLine();
			System.out.println("Digite um novo Preco:");
			String novoPreco = opcao.nextLine();
			bancoDados.atualizarLivro(isbn, novoTitulo, novoIsbn, novaCategoria, novoPreco);
		}else {
			System.out.println("Esse Livro N„o foi cadastrado!!");
		}
	}
}
