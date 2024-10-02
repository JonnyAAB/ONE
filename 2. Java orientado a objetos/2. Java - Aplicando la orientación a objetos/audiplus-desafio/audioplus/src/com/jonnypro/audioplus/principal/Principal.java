package com.jonnypro.audioplus.principal;

import com.jonnypro.audioplus.modelos.Cancion;
import com.jonnypro.audioplus.modelos.MisFavoritos;
import com.jonnypro.audioplus.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Overcompensate");
        miCancion.setCantante("Twenty One Pilots");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Fepo");
        miPodcast.setTitulo("Paranormal Podcast");

        // Canción
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Numero de me gusta de " + miCancion.getTitulo() + " es de: " + miCancion.getTotalDeMeGusta());
        System.out.println("Numero de reproducciones de " + miCancion.getTitulo() + " es de: " + miCancion.getTotalDeReproducciones ());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciones(miPodcast);
        favoritos.adiciones(miCancion);
    }
}
