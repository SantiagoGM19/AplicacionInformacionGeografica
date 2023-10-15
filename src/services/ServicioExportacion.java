package services;

import domain.Grafo;
import domain.Nodo;

import java.util.List;

public class ServicioExportacion {

    private Convertidor convertidorFormato;

    public ServicioExportacion(Convertidor convertidor){
        this.convertidorFormato = convertidor;
    }

    public String exportar(Grafo grafo){
        return "";
    }

    public List<Nodo> iterarGrafo(Grafo grafo){
        return List.of();
    }
}
