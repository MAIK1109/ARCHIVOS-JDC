import Controlador.bibliotecaControlador;
import Modelo.bibliotecaModelo;
import Vista.bibliotecaVista;

public class Biblioteca {
    public static void main(String[] args) {
        bibliotecaModelo model = new bibliotecaModelo(null, null, null);
        bibliotecaVista view = new bibliotecaVista(null);
        bibliotecaControlador controller = new bibliotecaControlador(view, model);
    }
}
