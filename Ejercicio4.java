
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double nota;
        double suma = 0;

        while (i <= 5) {
            System.out.print("Ingrese la nota " + i + " (0-20): ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 20) {
                suma = suma + nota;
                i++;
            } else {
                System.out.println("Nota invalida. Intente otra vez.");
            }
        }

        double promedio = suma / 5;

        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}
