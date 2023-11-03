import java.util.ArrayList;

class Leitor {
    private String nome;  /*criação do objeto privado "nome" */
    private ArrayList<Livro> livros;  /*cria a lista de livros que foram emprestados por aquele leitor */

    public Leitor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();  /*inicialização da lista de livros*/
    }
  
    /*método publico para utilização do objeto privado "nome"*/
    public String getNome() {
        return nome;
    }

    /*método publico para utilização do objeto privado 'livros'*/
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro); /*adiciona livros a lista de livros emprestados*/
    }
}