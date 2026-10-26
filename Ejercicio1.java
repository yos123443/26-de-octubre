
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int i = 1;
        int suma = 0;

        while (n <= 0) {
            System.out.print("Ingrese N (positivo): ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Error: ingrese un numero positivo.");
            }
        }

        while (i <= n) {
            suma = suma + i;
            i++;
        }

        System.out.println("Resultado: " + suma);
        sc.close();
    }
}