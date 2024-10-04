package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeJonny = new Pelicula("El señor de los anillos", 2011);
        peliculaDeJonny.evalua(10);

        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = peliculaDeJonny;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJonny);
        lista.add(lost);

        // For-ech
        for (Titulo item : lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula itemPelicula && itemPelicula.getClasificacion() > 2){
                System.out.println(itemPelicula.getClasificacion());
            }
        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista orodenada por fecha: " + lista);
    }
}
