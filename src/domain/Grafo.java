package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grafo {
    private List<Enlace> enlaces;
    private List<Nodo> nodos;

    public Grafo() {
        this.nodos = new ArrayList<>();
        this.enlaces = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo){
        this.nodos.add(nodo);
    }

    public void agregarEnlace(Enlace enlace){
        this.enlaces.add(enlace);
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }
}
