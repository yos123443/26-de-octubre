
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while (n <= 0) {
            System.out.print("Ingrese N (positivo): ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Ingrese un numero positivo.");
            }
        }

        int i = 1;
        int contador = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                contador++;
            }
            i++;
        }

        System.out.println("Cantidad de pares: " + contador);
        sc.close();
    }
}
