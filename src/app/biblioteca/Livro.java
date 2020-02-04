package app.biblioteca;

public class Livro {
	private String titulo;
	private String isbn;
	private String categoria;
	private String preco;

	public Livro(String titulo, String isbn, String categoria,String preco) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.categoria = categoria;
		this.preco = preco;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

}