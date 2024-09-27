package com.jonnypro.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Tiene muy buena evaluación");
        } else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Algo popular actualmente");
        } else{
            System.out.println("Colocálo en tu lista para verlo después");
        }
    }
}
