
import java.util.Scanner;

public class Calculadora {
    public static int Calculadora(int opcion) {

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        Scanner leer = new Scanner(System.in);

        double Numero1, Numero2, Resultado = 0;
        int opcion;

        do {
            System.out.println("Ingrese Operacion");
            opcion = leer.nextInt();
            if (opcion <= 0 || opcion >= 5) {
                System.out.println("OPCION INCORRECTA");

            }
        } while (opcion <= 0 || opcion >= 5);

        System.out.println("Ingresa el Primer Numero: ");
        Numero1 = leer.nextDouble();

        System.out.println("Ingresa el Segundo Numero: ");
        Numero2 = leer.nextDouble();

        switch (opcion) {
            case 1:
                Resultado = (Numero1 + Numero2);
                System.out.println("El resultado de la Suma es:" + Resultado);
                break;
            case 2:
                Resultado = (Numero1 - Numero2);
                System.out.println("El resultado de la Resta de " + Numero1 + " - " + Numero2 + " = " + Resultado);
                break;
            case 3:
                Resultado = (Numero1 * Numero2);
                System.out.println("El resultado de la Multiplicación es:" + Resultado);
                break;
            case 4:
                if (Numero2 == 0) {
                    System.out.println("ERROR DIVISION ENTRE 0");

                } else {
                    Resultado = (Numero1 / Numero2);
                    System.out.println("El resultado de la División es:" + Resultado);
                    break;
                }
        }

    }
}
