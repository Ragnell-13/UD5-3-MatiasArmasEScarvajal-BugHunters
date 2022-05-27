package com.digitalcastaway.biblioteca;

public interface Usuario {

    public abstract void obtenerLibro(int posicion, Biblioteca biblioteca);
    public abstract String obtenerLibroAleatorio(Biblioteca biblioteca);
    public abstract void devolverLibro(String titulo, Biblioteca biblioteca);
}
