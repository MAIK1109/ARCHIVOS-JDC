public class Suma_Matrices {
    public static void main(String[] args) {
        // Definir matrices
        int[][] matriz1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matriz2 = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        // Llamar a la función de suma de matrices
        int[][] matrizResultante = sumaMatrices(matriz1, matriz2);

        System.out.println("Matriz resultante de la suma:");
        mostrarMatriz(matrizResultante);
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Las matrices deben tener las mismas dimensiones.");
            return null;
        }

        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}