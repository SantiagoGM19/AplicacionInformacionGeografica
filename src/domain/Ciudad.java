package domain;

import services.ExtractorInfoNodos;

import java.util.ArrayList;
import java.util.List;

public class Ciudad extends Nodo{

    private String estadoEspecifico;

    public Ciudad(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    public List<String> funcInfoGeo() {
        List<String> infoCiudad = new ArrayList<>();
        infoCiudad.add("Ciudad");
        infoCiudad.add(estadoComun);
        infoCiudad.add(estadoEspecifico);
        infoCiudad.add("repite una letra");
        return infoCiudad;
    }

    @Override
    public String aplicarAlgoritmo(ExtractorInfoNodos extractor) {
        return extractor.exportarInfoNodoCiudad(this);
    }
}
