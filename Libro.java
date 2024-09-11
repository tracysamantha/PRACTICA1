/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1poo2;

/**
 *
 * @author tracy
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private String sipnosis;
    private String Genero;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.sipnosis = sipnosis;
        this.Genero = Genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", sipnosis=" + sipnosis + ", Genero=" + Genero + '}';
    }
    

}