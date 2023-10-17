package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Grafo {
    private List<Enlace> enlaces;
    private List<Nodo> nodos;

    public Grafo() {
        this.nodos = new ArrayList<>();
        this.enlaces = new ArrayList<>();
    }

    public Nodo agregarNodo(String tipoNodo, String estadoComun, String estadoEspecifico){
        Nodo nodo =  crearNodo(tipoNodo, estadoComun, estadoEspecifico);
        this.nodos.add(nodo);
        return nodo;
    }

    /**
     * Se crea los nodos acá por simplicidad y porque el diseño
     * indica que así debe ser, pero no es objetivo del ejercicio
     * definir la estrategia de creación para los nodos
     * */
    private Nodo crearNodo(String tipoNodo, String estadoComun, String estadoEspecifico){
        switch (tipoNodo.toLowerCase()) {
            case "ciudad":
                return new Ciudad(estadoComun, estadoEspecifico);
            case "industria":
                return new Industria(estadoComun, estadoEspecifico);
            case "lugarturismo":
                return new LugarTurismo(estadoComun, estadoEspecifico);
            default:
                throw new NoSuchElementException("Nodo no definido");

        }
    }

    /**
     * Se crea los enlaces acá por simplicidad y porque el diseño
     * indica que así debe ser, pero no es objetivo del ejercicio
     * definir la estrategia de creación para los nodos
     * */
    public void agregarEnlace(Nodo origen, Nodo destino){
        this.enlaces.add(new Enlace(origen, destino));
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }
}
