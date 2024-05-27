import java.util.*;

public class SUDOKU {
    static Random ran = new Random();

    public static void main(String[] args) {

        int Tablero[][] = new int[9][9];

        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {

                Tablero[i][j] = 0;
                if (Tablero[i][j] == 0) {
                    int n = ran.nextInt(1, 10);
                    Tablero[i][j] = n;

                }

                System.out.print(Tablero[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
