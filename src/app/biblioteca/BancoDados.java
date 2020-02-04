package app.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * BancoDados
 */
public class BancoDados {

    //Declarando um atributo do tipo List para guardar os livros cadastrados
    private List<Livro> livros;

    public BancoDados() {
        //intanciado um ArrayList onde sera guardado os livros
        this.livros = new ArrayList<Livro>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void cadastrarLivro(String titulo, String isbn, String categoria, String preco){
        int indece = 0;
        //Adiciona um novo livro
        livros.add(new Livro(titulo,isbn,categoria,preco));
        //retornando o indece que o livro foi cadastrado
        indece = livros.size() - 1;
        System.out.println("Livro "+ livros.get(indece).getTitulo()+" cadastrado  com sucesso");
    }
    
    
    //M�todo deletarLivro, recebe um isbn por par�metro
    public void deletarLivro(String isbn) {
    	//for normal para percorrer a lista
    	for (int i = 0; i < livros.size(); i++) {
    		//Pega o livro de cada posi��o representada pelo i, e verifica se o isbn dele � igual ao recebido
    		//por par�metro (o que est� entre par�nteses)
    		if(livros.get(i).getIsbn().equals(isbn)) {
    			//Se for, ele remove o livro que est� nessa posi��o
    			livros.remove(i);
    		}	
		}
    }
    //recebe o atributos abaixo no parametro
    public void atualizarLivro(String isbnAntigo, String titulo, String isbn, String categoria, String preco) {
    	for (int i = 0; i < livros.size(); i++) {
    		if(livros.get(i).getIsbn().equals(isbnAntigo)) {
    			livros.get(i).setTitulo(titulo);
    			livros.get(i).setIsbn(isbn);
    			livros.get(i).setCategoria(categoria);
    			livros.get(i).setPreco(preco);
    		}
    	}
    }

    public void listarLivro(){
        //verifica se a lista está vazia
        boolean estaVazia = livros.isEmpty();
        if (estaVazia) {
            System.out.println("Está vazia");
        } else {
            int indice = 1;
            //percorre todo o ArrayList
            for (Livro livro : livros) {
                System.out.println(indice + " - " + livro.getTitulo());
                System.out.println("Categoria - " + livro.getCategoria());
                System.out.println("Preco - " + livro.getPreco());
                System.out.println("isbn - " + livro.getIsbn());
                System.out.println("------");
                indice++;
            }
        }
    }
    //recebe o isbn por par�metro
    public boolean buscarLivro(String isbn) {
    	
    	for (int i = 0; i < livros.size(); i++) {
    		
    		if(livros.get(i).getIsbn().equals(isbn)) {
    			
    			return true;
    		}
    	}
    	return false;
    }
}