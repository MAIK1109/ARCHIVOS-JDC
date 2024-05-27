import java.util.Scanner; //1 Importar la Clase Scanner del paquete Java.util.

public class NUMEROS_COMPRENDIDOS {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);// 2 Se Inicializa el Escanner.

        int Numero1 = 0, Numero2 = 0;// 3 Declarar Variables.

        System.out.println("INGRESE EL PRIMER NUMERO : "); // 4
        Numero1 = leer.nextInt();

        System.out.println("INGRESE EL SEGUNDO NUMERO : ");// 5
        Numero2 = leer.nextInt();

        System.out.println("Los numeros Comprendidos son los Siguientes: ");

        OrdenarNumeros(Numero1, Numero2);

    }

    static void OrdenarNumeros(int Numero1, int Numero2) {

        int Mayor = 0, Menor;

        if (Numero1 > Numero2) {
            Mayor = Numero1;
            Menor = Numero2;
        } else {
            Mayor = Numero2;
            Menor = Numero1;
        }

        for (int i = Menor; i <= Mayor; i++) {

            System.out.println("NUMERO - " + i);
        }
    }
}