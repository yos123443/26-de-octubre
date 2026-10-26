
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int numero;
        int mayor = 0;
        int menor = 0;

        while (i <= 10) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            i++;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
