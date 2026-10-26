
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while (n < 0 || n > 20) {
            System.out.print("Ingrese un numero entre 0 y 20: ");
            n = sc.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Numero invalido.");
            }
        }

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}
