package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Serie lost = new Serie("Lost", 2000);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(8);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                //Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }
        }
        System.out.println(lista);

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope");
        listaDeArtistas.add("Antonio");
        listaDeArtistas.add("Ricardo");
        listaDeArtistas.add("Juan");
        listaDeArtistas.add("Esteban");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println(listaDeArtistas);

        //ordenando lista 4:30 Alura
    }
}
