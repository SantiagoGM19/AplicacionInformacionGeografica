package services;

import domain.Grafo;
import domain.Nodo;

import java.util.List;

public class IteradorGrafo {

    public List<Nodo> iterarGrafo(Grafo grafo){
        return grafo.getNodos();
    }
}
