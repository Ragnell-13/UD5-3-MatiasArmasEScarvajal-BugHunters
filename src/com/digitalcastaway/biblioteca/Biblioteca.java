package com.digitalcastaway.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Biblioteca {
    private String name;
    private static ArrayList<String> catalogoLibros;

    public Biblioteca(String name) {
        this.name = name;
        this.catalogoLibros = new ArrayList<String>(Arrays.stream(Catalogo.libros).toList());
    }

    public void showCatalog() {
        Iterator<String> it = catalogoLibros.iterator();
        System.out.println("################################");
        System.out.println("# Mostrando catálogo de libros #");
        System.out.println("################################");

        int contador = 0;

        while(it.hasNext()) {
            System.out.println(contador + " --> " + it.hasNext());
            contador--;
        }
    }

    public static String prestarLibro(int posicion) {
        return catalogoLibros.remove(posicion);
    }

    public static String prestarLibroAleatorio() {
        int posicionAleatoria = (int) (Math.random() * catalogoLibros.size());
        return prestarLibro(posicionAleatoria);
    }

    public void devolverLibro(String titulo) {
        catalogoLibros.add(titulo);
    }
}
