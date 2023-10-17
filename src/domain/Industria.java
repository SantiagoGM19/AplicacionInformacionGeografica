package domain;

import services.ExtractorInfoNodos;

import java.util.List;

public class Industria extends Nodo{
    private String estadoEspecifico;

    public Industria(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    String funcInfoGeo() {
        return null;
    }

    @Override
    public String aplicarAlgoritmo(ExtractorInfoNodos extractor) {
        return extractor.exportarInfoNodoIndustria(this);
    }
}
