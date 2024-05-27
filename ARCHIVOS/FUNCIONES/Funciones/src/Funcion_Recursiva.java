public class Funcion_Recursiva {
    public static int Factorial(int Numero) {
        if (Numero == 0 || Numero == 1) {
            return 1;
        } else {
            return Numero * Factorial(-1);

        }
    }

    public static void main(String[] args) {
        int NumeroFactorial = 5;
        System.out.println(NumeroFactorial + Factorial(NumeroFactorial));
    }
}
