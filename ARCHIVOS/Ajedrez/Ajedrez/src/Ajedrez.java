public class Ajedrez {
    public static void main(String[] args) {

        // FILAS
        for (int i = 1; i <= 8; i++) {
            // COLUMNAS
            for (int j = 1; j <= 8; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("▀");
                } else {
                    System.out.print("-");
                }
                if (j == 8) {
                    System.out.print("\n");
                }

            }

        }
    }

}