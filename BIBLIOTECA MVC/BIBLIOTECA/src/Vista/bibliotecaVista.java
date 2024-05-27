package Vista;

import java.util.Scanner;

import Modelo.bibliotecaModelo;

public class bibliotecaVista {
    private Scanner leer;

    public bibliotecaVista(Scanner leer) {
        this.leer = leer;
    }

    public int mostrarMenu() {
        System.out.println("MENU BIBLIOTECA");
        System.out.println("[1] Mostrar Libro");
        System.out.println("[2] Agregar Libro");
        System.out.println("[3] Salir");
        System.out.println("Elije una Opcion");
        int Menu = leer.nextInt();
        leer.nextLine();
        return Menu;
    }

    public bibliotecaModelo agregarLibro() {
        System.out.println("Ingrese el Nombre del Libro");
        String Nombre = leer.nextLine();
        System.out.println("Ingrese el Nombre del Autor");
        String Autor = leer.nextLine();
        System.out.println("Ingrese el Año");
        String Año = leer.nextLine();

        return new bibliotecaModelo(Nombre,Autor,Año);
    }
    
    public bibliotecaModelo agregarLibro() {
        System.out.println("Ingrese el Nombre del Libro");
        String Nombre =  leer.getNombre();
        System.out.println("Ingrese el Nombre del Autor");
        String Autor = leer.nextLine();
        System.out.println("Ingrese el Año");
        String Año = leer.nextLine();

        return new bibliotecaModelo(Nombre,Autor,Año);
    }

}
