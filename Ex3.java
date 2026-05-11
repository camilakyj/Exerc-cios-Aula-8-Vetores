// Camila Aki Yagima Jerônimo
package dobackofront;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = entrada.nextLine();
        }


        System.out.println("\nNomes do último para o primeiro:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

       
        System.out.println("\nPrimeiro nome armazenado: " + nomes[0]);
        System.out.println("Último nome armazenado: " + nomes[4]);

        entrada.close();
    }
}
