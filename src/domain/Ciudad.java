package domain;

import services.ExtractorInfoNodos;

import java.util.List;

public class Ciudad extends Nodo{

    private String estadoEspecifico;

    public Ciudad(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    String funcInfoGeo() {
        return null;
    }

    @Override
    public String aplicarAlgoritmo(ExtractorInfoNodos extractor) {
        return extractor.exportarInfoNodoCiudad(this);
    }
}
