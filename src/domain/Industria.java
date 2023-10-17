package domain;

import services.ExtractorInfoNodos;

import java.util.ArrayList;
import java.util.List;

public class Industria extends Nodo{
    private String estadoEspecifico;

    public Industria(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    public List<String> funcInfoGeo() {
        List<String> infoCiudad = new ArrayList<>();
        infoCiudad.add("Industria");
        infoCiudad.add(estadoComun);
        infoCiudad.add(estadoEspecifico);
        infoCiudad.add("repite dos letra");
        return infoCiudad;
    }

    @Override
    public String aplicarAlgoritmo(ExtractorInfoNodos extractor) {
        return extractor.exportarInfoNodoIndustria(this);
    }
}
