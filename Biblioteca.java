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

    private List<Libro> libros; //atributo privado libros para lista de objetos Libro
    private List<Autor> autores;


    public Biblioteca() {
        libros = new ArrayList<>(); //inicializamos el atributo libros como nueva instancia de arraylist
        autores = new ArrayList<>(); 
        cargarLibrosDesdeArchivo();  
        cargarAutoresDesdeArchivo();  
    }


       public void cargarAutoresDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tracy\\Downloads\\autores.txt"))) { // Archivo de autores
            String linea;
            while ((linea = br.readLine()) != null) {
                autores.add(new Autor(linea.trim())); // Cargar cada autor como un nuevo objeto Autor
            }
            System.out.println("Autores cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de autores: " + e.getMessage());
        }
    }

    public void cargarLibrosDesdeArchivo() { //se encarga de leer libros desde el archivo de texto y agregarlo a la lista libro 
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tracy\\Downloads\\libros.txt"))) { 
            String linea; //declaramos una variable linea para almacenar cada linea leida del archivo 
            while ((linea = br.readLine()) != null) { //lee cada linea del archivo en bucle while, el bucle terminara cuando readLine devuelva null 
                String[] partes = linea.split(";"); 
                if (partes.length == 5) { 
                    String ISBN = partes[0];
                    String titulo = partes[1];
                    String autor = partes[2];
                    String sipnosis = partes[3];
                    String genero = partes[4];
                    libros.add(new Libro(ISBN, titulo, autor, sipnosis, genero));  
                }
            }
            System.out.println("Libros cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
     public List<Autor> getAutores() {
        return autores;  
    }

    public List<Libro> getLibros() {
        return libros;  
    }

    public void crearLibro(String ISBN, String titulo, String autor, String sipnosis, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   }

