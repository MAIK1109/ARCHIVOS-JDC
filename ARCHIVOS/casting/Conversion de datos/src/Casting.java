public class Casting {
    public static void main(String[] args) {

        // Asgnacion de Variables

        int a = 5, b = 10, ResultadoSuma = 0, ResultadoResta = 0,
                ResultadoMultiplicacion = 0, ResultadoDivision = 0, ResultadoModulo = 0;

        // Operaciones Basicas

        ResultadoSuma = (a + b);
        ResultadoResta = (a - b);
        ResultadoMultiplicacion = (a * b);
        ResultadoDivision = (a / b);
        ResultadoModulo = (a % b);

        System.out.println("Resultado Suma : " + ResultadoSuma);
        System.out.println("Resultado Resta : " + ResultadoResta);
        System.out.println("Resultado Multiplicacion : " + ResultadoMultiplicacion);
        System.out.println("Resultado Division : " + ResultadoDivision);
        System.out.println("Resultado Modulo : " + ResultadoModulo);

        // Incrementos y Decrementos

        a++;
        b--;
        System.out.println("El valor Incrementado en a es : " + a);
        System.out.println("El valor Incrementado en b es : " + b);

        // Incrementa el valor de a en 2 y Multiplica el valor de b por 3

        a += 2;
        b *= 3;
        System.out.println("El valor de b umentado en 2 es : " + a);
        System.out.println("El valor de b multiplicado por 3 es : " + b);

        // Comprueba si "a" es igual a "b"
        boolean Comparacion;
        if (a == b) {
            System.out.println("¿'A' Es Igual a 'b'?");
            Comparacion = true;
            System.out.println(Comparacion);
        } else if (a != b) {
            System.out.println("¿'A' Es Diferente de 'b'?");
            Comparacion = true;
            System.out.println(Comparacion);
        } else if (a > b) {
            System.out.println("¿'A' Es Mayor de 'b'?");
            Comparacion = true;
            System.out.println(Comparacion);
        } else if (a < b) {
            System.out.println("¿'A' Es Menor e de 'b'?");
            Comparacion = true;
            System.out.println(Comparacion);
        }

    }
}
