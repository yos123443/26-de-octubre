
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        while (n <= 0) {
            System.out.print("Ingrese la cantidad de terminos: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Ingrese un numero positivo.");
            }
        }

        long a = 0;
        long b = 1;
        int i = 1;

        while (i <= n) {
            System.out.print(a + " ");

            long siguiente = a + b;
            a = b;
            b = siguiente;

            i++;
        }

        System.out.println();
        sc.close();
    }
}