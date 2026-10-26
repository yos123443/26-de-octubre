
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        double retiro = -1;

        while (retiro != 0) {
            System.out.println("\nSaldo actual: S/ " + saldo);
            System.out.print("Ingrese el monto a retirar (0 para salir): ");
            retiro = sc.nextDouble();

            if (retiro < 0) {
                System.out.println("Error: monto no valido.");
            } else if (retiro > saldo) {
                System.out.println("Error: saldo insuficiente.");
            } else if (retiro > 0) {
                saldo = saldo - retiro;
                System.out.println("Retiro exitoso.");
                System.out.println("Saldo restante: S/ " + saldo);
            }
        }

        System.out.println("Gracias por utilizar el cajero.");
        sc.close();
    }
}
