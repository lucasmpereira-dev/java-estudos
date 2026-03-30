// para comentários
import java.util.Scanner;

public class Inicio {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Digite a Nota 1");
        nota1 = entrada.nextDouble(); 

        System.out.println("Digite a Nota 2");
        nota2 = entrada.nextDouble(); 

        System.out.println("Digite a Nota 3");
        nota3 = entrada.nextDouble(); 

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("A nota 1 é: "+ media);

            if(media>=7){
                System.out.println("Parabéns passou");
            }
            else if(media>=4)
                System.out.println("recuperação");
            else
                System.out.println("Não passou");
        
        entrada.close();
    }

}
