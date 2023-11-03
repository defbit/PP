import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*criação dos objetos 'AUTORES' usando método construtor new */
        Autor autor1 = new Autor("Chimamanda Ngozi", "Nigéria");
        Autor autor2 = new Autor("Paulo Coelho", "Brasil");
        Autor autor3 = new Autor("Edgar Allan Poe", "Estados Unidos da América");

        /*criação dos objetos 'LIVROS' usando metodo construtor new*/
        Livro livro1 = new Livro("Hibisco Roxo", autor1);
        Livro livro2 = new Livro("Veronika Quer Morrer", autor2);
        Livro livro3 = new Livro("O Estranho Caso do Sr. Waldemar", autor3);

        /* criação dos objetos 'LEITORES' usando metodo construtor new  */
        Leitor leitor1 = new Leitor("Pedro");
        Leitor leitor2 = new Leitor("Ana");
        Leitor leitor3 = new Leitor("Ramon");

        /*Criando a associação entre livros e leitores ao adicionar cada leitor na lista de leitores de cada livro*/
        livro1.adicionarLeitor(leitor1);
        livro2.adicionarLeitor(leitor2);
        livro3.adicionarLeitor(leitor3);

        /*Criando o objero scnner utilizado no menu desse programa */
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            /*menu principal do programa*/
            System.out.println("Escolha uma opção:");
            System.out.println("1 - livros disponiveis");
            System.out.println("2 - livros indisponiveis (emprestados)");
            System.out.println("3 - Sair da biblioteca");

            /*função que lê o proximo numero escolhido pelo usuario apos a execução completa do código*/
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  /*print simples que mostra as informações da opção 1*/  
                  System.out.println("\nLivros disponíveis na biblioteca:");
                    System.out.println("Título: " + livro1.getTitulo());
                    System.out.println("Autor: " + livro1.getAutor().getNome());
                    System.out.println("Título: " + livro2.getTitulo());
                    System.out.println("Autor: " + livro2.getAutor().getNome());
                    System.out.println();
                    break;
                case 2:
                  /*print simples que mostra as informações da opção 2*/  
                  System.out.println("\nLista de livros emprestados:");
                    for (Livro livro : leitor3.getLivros()) {
                        System.out.println("Aluno que emprestou o livro: " + leitor3.getNome());
                        System.out.println("Título: " + livro.getTitulo());
                        System.out.println("Autor: " + livro.getAutor().getNome());
                        System.out.println();
                    }
                    break;
                case 3:
                    /*print simples que mostra as informações da opçãp 3*/
                    System.out.println("Você saiu.");
                    break;
                default:
                    /*print que aparece se o usuário escolher qualquer coisa que seja dirente de 123*/
                    System.out.println("Opção inválida. Tente outro número.\n");
                    break;
            }
        }

        scanner.close();
    }
}
