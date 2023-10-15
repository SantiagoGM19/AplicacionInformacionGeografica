package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

abstract public class Nodo<T> {
    protected T estadoComun;
    private List<Enlace> enlaces;

    Nodo(T estadoComun){
        this.estadoComun = estadoComun;
        this.enlaces = new ArrayList<>();
    }

    public void agregarEnlace(Enlace enlace){
        this.enlaces.add(enlace);
    }

    public List<Enlace> getEnlaces(){
        return enlaces;
    }

    abstract String funcInfoGeo();

    abstract String aplicarAlgoritmo();
}
