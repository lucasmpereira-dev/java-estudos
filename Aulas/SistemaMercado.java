import java.util.ArrayList;
import java.util.Scanner;

class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade" + quantidade);
        System.out.println("----------------------");

    }
}

public static void cadastrarProduto() {
    sc.nextline();
    System.out.println("Nome do Produto: ");
    // texto
    String nome = sc.nextline();

    System.out.println("Preço: ");
    // numero com virgula
    double preco = sc.nextDouble();

    System.out.println("Quantidade: ");
    // numero inteiro
    int quantidade = sc.nextInt();

    Produto p = new Produto(nome, preco, quantidade);
    listarProdutos.add(p);

    System.out.println("Produto cadastrado com Sucesso!");

}

public static int menu() {
    System.out.println("\n======= Mercado do Luquinha =======");
    System.out.println("1 - Cadastrar Produto");
    System.out.println("2 - Lista de Produtos");
    System.out.println("3 - Sair");
    System.out.println("Escolha uma Opção: ");

}

public class SistemaMercado {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Produto> listarProdutos = new Arraylist<>();

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = menu();
            switch (opcao) {

                case 1 -> cadastrarProduto();

                case 2 -> listarProdutos();

                case 3 -> System.out.println("Saindo do Sistema...");

                default -> System.out.println("Opção Inválida!");
            }

        } while (opcao != 3);
        sc.close();
    }

}

public static void listarProdutos() {
    if (listarProdutos.isEmpty()) {
        System.out.println("Nenhum Produto Cadastrado!");

    }
    System.out.println("\n=== Lista de Produtos ===");
    for (Produto p : listarProdutos) {
        p.exibir();

    }

}