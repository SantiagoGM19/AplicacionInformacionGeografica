package domain;

import services.ExtractorInfoNodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

abstract public class Nodo {
    protected String estadoComun;
    private List<Enlace> enlaces;

    Nodo(String estadoComun){
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

    public abstract String aplicarAlgoritmo(ExtractorInfoNodos extractor);
}
