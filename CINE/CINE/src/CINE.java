import java.util.Scanner;

public class CINE {

    static int i, j;
    static int Ocupado = 1;
    static int Disponible = 0;
    static int Filas = 8, Columnas = 8;
    static int[][] Asientos = new int[8][8];

    public CINE() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Asientos[i][j] = Disponible;

            }
        }
    }

    public static void ImprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("| 0 |");
            }
            System.out.println();
        }

    }

    public static void ReservarAsientos(Scanner leer) {

        int j = 0;
        int i = 0;

        System.out.println("...Seleccione el Asiento que desea Reservar....");

        System.out.println("Ingrese la Posicion para la Fila : ");

        i = leer.nextInt();

        System.out.println("Ingrese la Posicion para la Columna . ");
        j = leer.nextInt();

        if ((i < 0 || i > 7) || (j < 0 || j > 7)) {
            System.out.println("???? El Asiento Seleccionado no es Valido ?????");

        } else {
            if (Asientos[i][j] == Ocupado) {
                System.out.println("Asiento Ocupado...\n Seleccione un asiento Disponible");
            } else {
                for (i = 0; i < 8; i++) {
                    for (j = 0; j < 8; j++) {
                        System.out.println(Asientos[i][j]);
                    }
                    System.out.println();
                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ReservarAsientos(leer);

    }
}
