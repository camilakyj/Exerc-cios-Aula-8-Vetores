// Camila Aki Yagima Jerônimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[4];
        int[] B = new int[7];
        int[] C = new int[11];

        System.out.println("Digite os elementos do vetor A:");

        for (int i = 0; i < 4; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }


        System.out.println("\nDigite os elementos do vetor B:");

        for (int i = 0; i < 7; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }


        for (int i = 0; i < 4; i++) {
            C[i] = A[i];
        }


        for (int i = 0; i < 7; i++) {
            C[i + 4] = B[i];
        }


        System.out.println("\nVetor C (junção de A e B):");

        for (int i = 0; i < 11; i++) {
            System.out.println(C[i]);
        }

        entrada.close();
    }
}
