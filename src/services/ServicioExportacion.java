package services;

import domain.Grafo;
import domain.Nodo;

import java.util.List;

public class ServicioExportacion {

    private ExtractorInfoNodos extractorInfoNodos;
    private CreadorDeConvertidor  creadorDeConvertidor;
    private IteradorGrafo iteradorGrafo;

    public ServicioExportacion(){
        extractorInfoNodos =  new ExtractorInfoNodos();
        creadorDeConvertidor =  new CreadorDeConvertidor();
        iteradorGrafo = new IteradorGrafo();
    }

    public String exportarAFormato(String formato){
        Convertidor convertidorFormato =  creadorDeConvertidor.crearConvertidor(formato);
        extractorInfoNodos.setConvertidor(convertidorFormato);
        Grafo grafo = new ServicioPersistencia().obtenerMapa();
        if(grafo != null){
            List<Nodo> nodos = iteradorGrafo.iterarGrafo(grafo);
            StringBuilder formatoBuilder = new StringBuilder();
            for (Nodo nodo:nodos) {
                formatoBuilder.append(nodo.aplicarAlgoritmo(extractorInfoNodos));
            }
            return formatoBuilder.toString();
        }
        return "Formato vacio";
    }
}
