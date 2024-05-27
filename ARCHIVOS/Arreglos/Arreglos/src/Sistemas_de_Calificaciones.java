import java.util.Scanner;

public class Sistemas_de_Calificaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 0;
        int Calificaciones = 0;
        System.out.print("Ingrese Numero de Estudiantes : ");
        n = leer.nextInt();
        Calificaciones = leer.nextInt();
        int[] Calificacion = new int[Calificaciones];

        int Estudiantes[] = new int[n];
        for (int i = 0; i < Estudiantes.length; i++) {
            System.out.print("Ingrese la Nota del Estudiante " + (i + 1) + ":");
            Calificacion[i] = leer.nextInt();

            if (Estudiantes[i] < 0 || Estudiantes[i] > 100) {
                System.out.print("Error");
                System.out.println("Ingrese un valor dentro del Rango");

                i--;
            }
        }
    }

}
