package _examenes.trimestre2;

import java.util.Scanner;

public class Main {

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

/*        Libro[] libros = {libro1, libro2};

        ColeccionLibros coleccion = new ColeccionLibros(libros);
        System.out.println(libro.toString());*/
    }
}
