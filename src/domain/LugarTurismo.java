package domain;

import services.ExtractorInfoNodos;

import java.util.ArrayList;
import java.util.List;

public class LugarTurismo extends Nodo{

    private String estadoEspecifico;

    public LugarTurismo(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    public List<String> funcInfoGeo() {
        List<String> infoCiudad = new ArrayList<>();
        infoCiudad.add("LugarTurismo");
        infoCiudad.add(estadoComun);
        infoCiudad.add(estadoEspecifico);
        infoCiudad.add("repite tres letra");
        return infoCiudad;
    }

    @Override
    public String aplicarAlgoritmo(ExtractorInfoNodos extractor) {
        return extractor.exportarInfoNodoLugarTurismo(this);
    }
}
