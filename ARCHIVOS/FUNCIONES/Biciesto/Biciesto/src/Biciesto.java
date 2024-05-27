import java.util.Scanner;

public class Biciesto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // AÑO

        int AñoDigitado;
        System.out.println("INGRESE EL AÑO");
        AñoDigitado = leer.nextInt();
        int ResAnnio = Anio(AñoDigitado);
       

        // MES
        int MesDigitado;
        System.out.println("INGRESE EL MES : ");
        MesDigitado = leer.nextInt();

        int ResMes = MesVal(MesDigitado);
        if (ResAnnio == 1) {

            System.out.println("Año Biciesto");
        } else {
            System.out.println("No es Biciesto");
        }

    }

    public static int Anio(int Anio) {
        int anio1 = 0;
        if (Anio % 4 == 0 && Anio % 100 != 0 || Anio % 400 == 0) {

            anio1 = 1;
        }

        return anio1;
    }

    public static int MesVal(int MesVal) {
        switch (MesVal) {
            case 1:
                System.out.println("ENERO\nEnero Tiene 31 Dias");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO\n Tiene 31 Dias");
                break;
            case 4:
                System.out.println("ABRIL\n Tiene 30 Dias");
                break;
            case 5:
                System.out.println("MAYO \n Tiene 31 Dias");
                break;
            case 6:
                System.out.println("JUNIO\n Tiene 30 Dias");
                break;
            case 7:
                System.out.println("JULIO\n Tiene 31 Dias");
                break;
            case 8:
                System.out.println("AGOSTO\n Tiene 31 Dias");
                break;
            case 9:
                System.out.println("SEPTIEMBRE\n Tiene 30 Dias");
                break;
            case 10:
                System.out.println("OCTUBRE\n Tiene 31 Dias");
                break;
            case 11:
                System.out.println("NOVIEMBRE\nTiene 30 Dias");
                break;
            case 12:
                System.out.println("DICIEMBRE\n Tiene 31 Dias");
                break;
        }
        return MesVal;
    }
}