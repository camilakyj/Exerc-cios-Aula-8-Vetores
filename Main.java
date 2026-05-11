// Camila Aki Yagima Jerônimo
package dobackofront;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor inteiro: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("\nElementos pares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }


        System.out.println("\nElementos ímpares:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

        entrada.close();
    }
}