package domain;

public class Enlace {
    private Nodo origen;
    private Nodo destino;

    public Enlace(Nodo origen, Nodo destino){
        this.origen = origen;
        this.destino = destino;
        this.origen.agregarEnlace(this);
        this.destino.agregarEnlace(this);
    }
}
