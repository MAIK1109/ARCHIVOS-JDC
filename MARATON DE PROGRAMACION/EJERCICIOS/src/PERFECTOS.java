import java.util.Scanner;

public class PERFECTOS {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Numero;

        System.out.println("INGRESE EL NUMERO : ");

        Numero = leer.nextInt();

        for (int i = 1; i < Numero; i++) {
            if (esPerfecto(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean esPerfecto(int Numero) {
        int suma = 0;

        for (int i = 1; i < Numero; i++) {
            if (Numero % i == 0) {

                suma += i;

            }
        }
        return suma == Numero;
    }

}