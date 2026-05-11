// Camila Aki Yagima Jerônimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("\nElementos do vetor C:");

        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }

        entrada.close();
    }
}
