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
        System.out.println("===============================");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("===============================");
    }
}

public class SistemaMercado {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Produto> listarProdutos = new ArrayList<>();

    public static void cadastrarProduto() {

        sc.nextLine();

        System.out.print("Nome do Produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);

        listarProdutos.add(p);

        System.out.println("Produto cadastrado!");
    }

    public static void listarProdutos() {

        if (listarProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("\n===== Lista de Produtos =====");
        for (Produto p : listarProdutos) {
            p.exibir();
        }
    }

    public static int menu() {

        System.out.println("\n===== Mercado do Luquinha =====");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("===============================");

        return sc.nextInt();
    }

    public static void main(String[] args) {

        int opcao;

        do {

            opcao = menu();

            switch (opcao) {

                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}