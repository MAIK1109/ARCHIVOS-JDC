import java.util.Scanner;

public class Calcular_IMC {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESA EL NOMBRE : ");
        String Nombre = leer.nextLine();

        System.out.println("INGRESA EL PESO : ");
        double Peso = leer.nextDouble();

        System.out.println("INGRESA LA ALTURA : ");
        double Altura = leer.nextDouble();

        double IMC = CalcularIMC(Altura, Peso);
        MostrarDatos(Nombre, IMC);
    }

    static double CalcularIMC(double Altura, double Peso) {
        Double CalculoIMC = Peso / (Altura * Altura);
        return CalculoIMC;
    }

    public static void MostrarDatos(String Nombre, double IMC) {
        System.out.println("Su Nombre es : " + Nombre + "\nSu IMC ES : " + IMC);
    }

}
