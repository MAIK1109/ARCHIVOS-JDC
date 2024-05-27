
import java.util.Scanner;

public class MATRIZ3X3 {

public static void main(String[] args) {
    double Coeficiente= 0;
    double [][] matriz = new double [3][4];
    double vector1[]= new double [4];
    double vector2[]= new double [3];
    Scanner leer = new Scanner(System.in);

    for (int j = 0; j < 4 ; j++) {
        System.out.println();
        System.out.print("\nINGRESE EL COEFICIENTE PARA " + i + " - " + j + " :");
        Coeficiente = leer.nextDouble();
        matriz [i][j] = Coeficiente;
    }

    System.out.println(); 
}

for (int i = 0; i < 3 ; i++) {
    for (int j = 0; j < 4 ; j++) {
        System.out.print("  ");
        System.out.print(matriz[i][j]);
    }
    System.out.println();
    System.out.println();
}

}

}

}
