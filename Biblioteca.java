/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo2;

import java.io.*;
import java.util.*;

/**
 *
 * @author tracy
 */
public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
        cargarLibrosDesdeArchivo();  // Cargar libros desde el archivo de texto al iniciar
    }

    // Método para cargar los libros desde el archivo de texto
    public void cargarLibrosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("librosyautores.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar la línea en partes: ISBN, Título, Autor
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    String ISBN = partes[0];
                    String titulo = partes[1];
                    String autor = partes[2];
                    libros.add(new Libro(ISBN, titulo, autor));  // Crear un objeto Libro y añadirlo a la lista
                }
            }
            System.out.println("Libros cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para buscar un libro por ISBN
    public void buscarLibro(String isbn) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getISBN().equals(isbn)) {
                System.out.println("Libro encontrado: " + libro.getTitulo() + " por " + libro.getAutor());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe el libro con ISBN " + isbn);
        }
    }

    // Método para agregar un nuevo libro y guardarlo en el archivo
    public void crearLibro(String isbn, String titulo, String autor) {
        libros.add(new Libro(isbn, titulo, autor));
        
    }
}
