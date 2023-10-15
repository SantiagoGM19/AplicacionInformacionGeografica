package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grafo {
    private List<Enlace> enlaces;
    private List<Nodo> nodos;

    public Grafo() {
        this.nodos = new ArrayList<>(List.of(new Ciudad("USA", "New York"), new Industria("USA","Fabrica textil"), new LugarTurismo("USA", "Gran cañon")));
        this.enlaces = enlaces;
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }
}
