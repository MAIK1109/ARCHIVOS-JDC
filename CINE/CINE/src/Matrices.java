import java.util.Scanner;
import java.util.Random;

public class Matrices {
    public static int[][] inciarMatriz(int Numero) {
        Scanner leer = new Scanner(System.in);

        Numero = leer.nextInt();
        Random Aleatorio = new Random();

        int[][] Matriz = new int[Numero][Numero];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = Aleatorio.nextInt();

            }
        }
        return Matriz;
    }

    public static void mostrar(int[][] Matriz) {

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                System.out.println(Matriz[i][j]);

            }
        }
    }

    public static void Multiplicar()

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    }

}
