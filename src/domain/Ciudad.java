package domain;

import java.util.List;

public class Ciudad extends Nodo{

    private String estadoEspecifico;

    Ciudad(String estadoComun, String estadoEspecifico) {
        super(estadoComun);
        this.estadoEspecifico = estadoEspecifico;
    }

    @Override
    String funcInfoGeo() {
        return null;
    }

    @Override
    String aplicarAlgoritmo() {
        return null;
    }
}