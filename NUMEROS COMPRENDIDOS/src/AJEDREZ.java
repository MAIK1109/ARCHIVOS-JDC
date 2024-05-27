public class AJEDREZ {
    public static void main(String[] args) {
        int i, j;
        int tablero[][] = new int[8][8];

        // Cargar Tablero con Ceros

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                tablero[i][j] = 0;
            }
        }

        // Imprimir Tablero
        for (i = 0; i < 8; i++) {
            System.out.print("0");
            for (j = 0; j < 8; j++) {

                if (tablero[i][j] == 0) {
                    System.out.print("0");
                }
            }

            System.out.print("\n");

        }
    }

}
