import java.util.Scanner;

public class CINE_JDC {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int Opcion = 0;

        int Matriz[][] = new int[9][9];

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                Matriz[i][j] = 0;
            }
        }

        System.out.println("MENU SALA");
        System.out.println("[1] MOSTRAR SALA");
        System.out.println("[2] RESERVAR");
        System.out.println("[3] CANCELAR RESERVA");
        System.out.println("[4] SALIR");
        System.out.println("INGRESE UNA OPCION : ");

        Opcion = leer.nextInt();

        switch (Opcion) {
            case 1:
                mostrarMatriz(Matriz);
                break;
            case 2:
                Reservar(Matriz);
                break;

            default:
                System.out.println("MENU SALA");
                System.out.println("[1] MOSTRAR SALA");
                System.out.println("[2] RESERVAR");
                System.out.println("[3] CANCELAR RESERVA");
                System.out.println("[4] SALIR");
                System.out.println("INGRESE UNA OPCION : ");
                
                Opcion = leer.nextInt();
                break;
        }

    }

    public static void mostrarMatriz(int[][] Matriz) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(Matriz[i][j]);

            }
            System.out.println();
        }
    }

    public static void Reservar(int[][] Matriz) {
        Scanner leer = new Scanner(System.in);
        int Fila, Columna;

        System.out.println("INGRESE LA FILA Y LA COLUMNA QUE DESEA RESERVAR");
        System.out.println("FILA : ");
        Fila = leer.nextInt();
        System.out.println("COLUMNA : ");
        Columna = leer.nextInt();

        if (Fila < 1 || Columna < 1 || Fila > 9 || Columna > 9) {
            System.out.println("!!! ASIENTO NO EXISTE !!!");
        } else if (Matriz[Fila][Columna] != 0) {
            System.out.println("!!! ASIENTO NO DISPONIBLE !!!");
        } else {
            Matriz[Fila][Columna] = 1;

            System.out.println("RESEREVA EXITOSA");
            System.out.println("FILA :" + Fila);
            System.out.println("COLUMNA : " + Columna);

            mostrarMatriz(Matriz);

        }

    }

}
