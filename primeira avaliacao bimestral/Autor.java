import java.util.ArrayList;

class Autor {
    private String nome; /*criação do objeto privado "nome" */
    private String nacionalidade; /*criação do objeto privado "nacionalidade" */
    private ArrayList<Livro> livros; /*criação da lista de livros escritos por aquele autor*/

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<>(); /*inicializa  lista de livros*/
    }
    /*método publico para utilização do objeto privado 'nome'*/
    public String getNome() {
        return nome;
    }

    /*método publico para utilização do objeto privado 'nacionalidade'*/
    public String getNacionalidade() {
        return nacionalidade;
    }

    /*método publico para utilização do objeto privado 'livros'*/
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    /*Adiciona o livro à lista de livros do autor*/
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}