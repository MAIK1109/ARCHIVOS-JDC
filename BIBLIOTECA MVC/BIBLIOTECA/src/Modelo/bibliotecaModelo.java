package Modelo;

public class bibliotecaModelo {
    private int n = 0;

    private String Nombre;
    private String Autor;
    private String Año;

    public bibliotecaModelo(String nombre, String autor, String año) {
        this.Nombre = nombre;
        this.Autor = autor;
        this.Año = año;
    }

    private int[] Arreglo = new int[n];

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String año) {
        Año = año;
    }

    public static void Libro(String Nombre, String Autor, String Año) {

    }

}
