import java.util.Scanner;

public class JUEGO {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] Abecedario = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T",
                "U","V", "W", "X", "Y", "Z" };

        for (int i = 15; i < Abecedario.length; i++) {

            System.out.print(Abecedario[i]);

        }
        System.out.println();
        System.out.println("INGRESA EL MENSAJE : ");

        String Mensaje = leer.nextLine();

        for (int i = 0;i<Mensaje.length();i++){
        String Letra = Mensaje.charAt(i);
        int index Letra - 'A'
        }
        

    }

}
