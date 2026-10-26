
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = 50;
        int numero = 0;
        int intentos = 0;

        while (numero != secreto) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();

            intentos++;

            if (numero < secreto) {
                System.out.println("El numero es mayor.");
            } else if (numero > secreto) {
                System.out.println("El numero es menor.");
            } else {
                System.out.println("Correcto!");
                System.out.println("Intentos realizados: " + intentos);
            }
        }

        sc.close();
    }
}
