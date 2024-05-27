import java.util.Scanner;

public class Calificaciones_Funciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("NUMERO DE ESTUDIANTES A PROMEDIAR: ");
        int n = leer.nextInt();
        int calificaciones[] = new int[n];
        ingresacalificacines(calificaciones, leer);
        calcularestadisticas(calificaciones, leer);
        distribucioncalificaciones(calificaciones, leer);

    }

    private static void ingresacalificacines(int[] calificaciones, Scanner leer) {

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("INGRESE LA CALIFICACION " + (i + 1) + ": ");
            calificaciones[i] = leer.nextInt();

            if (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.print("ERROR EL RANGO DE LAS CALIFICACIONES DEBE ESTAR ENTRE 0 Y 100");
                calificaciones[i] = leer.nextInt();

            }
        }
    }

    private static void calcularestadisticas(int[] calificaciones, Scanner leer) {
        double Promedio = 0;
        int CalificacionMaxima = 0, CalificacionMinima = 100;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > CalificacionMaxima) {
                CalificacionMaxima = calificaciones[i];
            }
            if (calificaciones[i] < CalificacionMinima) {
                CalificacionMinima = calificaciones[i];
            }
        }
        System.out.println();
        System.out.println("LA CALIFICACION MAS ALTA ES: " + CalificacionMaxima);
        System.out.println("LA CALIFICACION MAS BAJA ES: " + CalificacionMinima);
        System.out.println();
        for (int i = 0; i < calificaciones.length; i++) {
            Promedio = Promedio + calificaciones[i];

        }
        Promedio = Promedio / calificaciones.length;
        System.out.println("EL PROMEDIO DE LAS NOTAS ES: " + Promedio);

    }

    private static void distribucioncalificaciones(int[] calificaciones, Scanner leer) {
        int suma = 0, Excelente = 0, Bueno = 0, Regular = 0, Insuficiente = 0;
        for (int i = 0; i < calificaciones.length; i++) {

            if (calificaciones[i] >= 90 && calificaciones[i] < 100) {
                Excelente++;
            } else {
                if (calificaciones[i] >= 70 && calificaciones[i] <= 89) {
                    Bueno++;
                } else {
                    if (calificaciones[i] >= 50 && calificaciones[i] <= 69) {
                        Regular++;
                    } else {
                        Insuficiente++;
                    }
                }
            }
        }
        System.out.println("Cantidad de Estudiantes con Nota Excelente: " + Excelente);
        System.out.println("Cantidad de Estudiantes con Nota Bueno: " + Bueno);
        System.out.println("Cantidad de Estudiantes con Nota Regular: " + Regular);
        System.out.println("Cantidad de Estudiantes con Nota Insuficiente: " + Insuficiente);

    }

}