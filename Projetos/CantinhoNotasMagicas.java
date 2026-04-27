package Projetos;

import java.util.Scanner;

public class CantinhoNotasMagicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tom da música: ");
        String tom = scanner.nextLine();

        System.out.print("Quantos versos a música possui? ");
        int quantidadeVersos = Integer.parseInt(scanner.nextLine());

        String[] versos = new String[quantidadeVersos];

        for (int i = 0; i < quantidadeVersos; i++) {
            System.out.print("Digite o verso " + (i + 1) + ": ");
            versos[i] = scanner.nextLine();
        }

        System.out.println("\n=============================");
        System.out.println("       MÚSICA COMPLETA");
        System.out.println("Tom: " + tom);
        System.out.println("=============================");

        for (int i = 0; i < versos.length; i++) {
            System.out.println("Verso " + (i + 1) + ": " + versos[i]);
        }

        System.out.println("=============================");

        scanner.close();
    }
}