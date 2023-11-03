import java.util.ArrayList;

class Livro {
    private String titulo; /*criação do objeto privado "titulo do livro" */
    private Autor autor; /*criação do objeto privado "titulo do autor " */
    private ArrayList<Leitor> leitores; /*criação da lista de leitores que pegaram algum livro emprestado*/

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo; /*inicialização dos titulos*/
        this.autor = autor; /*inicialização dos autores*/
        this.leitores = new ArrayList<>(); /*inicialização da lista de leitores*/
        autor.adicionarLivro(this);/*criação da relação de composição entre autor e titulo */
    }

    /*método publico para utilização do objeto privado 'titulo'*/
    public String getTitulo() {
        return titulo;
    }

    /*método publico para utilização do objeto privado 'autor'*/
    public Autor getAutor() {
        return autor;
    }

    /*método publico para utilização da lista privada 'leitores'*/
    public ArrayList<Leitor> getLeitores() {
        return leitores;
    }

    public void adicionarLeitor(Leitor leitor) {
        leitores.add(leitor);
        leitor.adicionarLivro(this);
    }
}