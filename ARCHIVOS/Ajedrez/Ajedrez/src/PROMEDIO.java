import java.util.Scanner;

public class PROMEDIO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Double Numero, Promedio, Respuesta = 0.0, Acumulador = 0.0;
        int i;
        System.out.println("Ingrese el Numero de Datos que va a promediar : ");
        Numero = leer.nextDouble();

        for (i = 1; i <= Numero; i++) {
            System.out.println("Ingresa el Numero " + i + " :");
            Respuesta = leer.nextDouble();
            Acumulador = (Acumulador + Respuesta);

        }
        Promedio = (Acumulador / Numero);
        System.out.println("El promedio es Igual a :" + Promedio);
    }
}
