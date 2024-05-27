import java.util.Scanner;

public class Fibonacci_Funcion {
    public static int Fibonacci(int c, int b, int a) {

        int i, n, a = 0, b = 0;
        return c;
    }

    public static void main(String[] args) {
        int i, n, a = 0, b = 0;
        System.out.println("Digite el Numero de la Serie");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        if (n < 1) {
            System.out.println("El Número debe ser Positivo");
        } else if (n == 1) {
            System.out.println("La serie Generada es" + a); 

        }
    }
}
