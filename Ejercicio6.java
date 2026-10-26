
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero = 0;

        while (numero < 100) {
            System.out.print("Ingrese un numero de 3 o mas cifras: ");
            numero = sc.nextLong();

            if (numero < 100) {
                System.out.println("Numero invalido.");
            }
        }

        int contador = 0;

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("Cantidad de digitos: " + contador);
        sc.close();
    }
}
