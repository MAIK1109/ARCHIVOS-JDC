package Controlador;

import Modelo.bibliotecaModelo;
import Vista.bibliotecaVista;

public class bibliotecaControlador {
    private bibliotecaVista view;
    private bibliotecaModelo model;

    public bibliotecaControlador(bibliotecaVista view, bibliotecaModelo model) {
        this.view = view;
        this.model = model;
    }

    public void Menu() {
        int Menu = 0;
        switch (Menu) {
            case 1:
                view.
                break;
            case 2:
                view.agregarLibro();
                break;
            case 3:

                break;
            default:
                break;
        }
    }

}
