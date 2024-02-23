import java.util.Scanner;

public class Ejercicio_Asteriscos {

    public static void main(String[] args) {
        int n, i, j;

        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa el Tamaño de n: ");

        n = leer.nextInt();

        // FILAS
        for (i = 1; i <= n; i++) {

            // COLUMNAS
            for (j = 1; j <= n; j++) {

                System.out.print("*");
                if (j == n) {
                    System.out.print("\n");
                }
            }
        }

    }
}
