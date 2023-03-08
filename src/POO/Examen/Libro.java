package POO.Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libro {

    /*EJERCICIO 1:
    * /*
    * Desarrolle una clase Libro que pueda contener la siguiente información:
    1)	ISBN: es un identificador único para libros, de diez o trece dígitos. No puede tener más o menos.
    2)	Título.
    3)	Autor.
    4)	Número de páginas.
    5)	Editorial.
    *
    Debe generar tres constructores:
    1)	Uno sin argumentos.
    2)	Otro que recibe ISBN, título y autor.
    3)	Otro que recibe todos los datos.
    Debe generar los getters y setters.
    Debe crear código de validación: si se intenta insertar un objeto null o un valor numérico incorrecto en alguno de
    * los atributos lance una excepción del tipo adecuado.
    Debe crear el método toString, de forma que cuando se imprima un libro por pantalla tenga exactamente el siguiente formato:
    *
    TÍTULO: Primera Guerra Mundial - ISBN: 0764526413 - AUTOR: Winston Churchill - PÁGINAS: 573
    Debe crear código en el main para testear su clase.
    */

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private String editorial;

    //     1)	Uno sin argumentos.
    public Libro() {
        isbn = 0;
        titulo = "DefaultTitle";
        autor = "DefaultAuthor";
        numeroDePaginas = 0;
        editorial = "DefaultEditorial";
    }
    //     2)	Otro que recibe ISBN, título y autor.
    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    //     3)	Otro que recibe todos los datos.
    public Libro(int isbn, String titulo, String autor, int numeroDePaginas, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.editorial = getEditorial();
    }

    //     Debe generar los getters y setters.
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        if(isbn == 10 || isbn == 13) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("El ISBN debe ser de 10 ó 13 dígitos");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if(numeroDePaginas >= 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            throw new IllegalArgumentException("No existe la páginas negativas.");
        }
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        String res = "TITULO: " + titulo + " - ISBN: " + isbn + " - AUTOR: " + autor + " - PÁGINAS: " + numeroDePaginas;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide por teclado los datos del libro
        System.out.println("Introduce los datos del libro");
        System.out.print("ISBN: ");
        int isbn = sc.nextInt();
        System.out.print("Título: ");
        String titulo = sc.next();
        sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.next();
        sc.nextLine();
        System.out.print("Número de página: ");
        int numeroDePaginas = sc.nextInt();
        String editorial = sc.nextLine();

//        TÍTULO: Primera Guerra Mundial - ISBN: 0764526413 - AUTOR: Winston Churchill - PÁGINAS: 573

        Libro libro = new Libro(isbn, titulo, autor, numeroDePaginas, editorial);

        System.out.println(libro.toString());
    }
}