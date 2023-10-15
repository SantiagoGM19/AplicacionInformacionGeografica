package domain;

import java.util.List;

public class Industria extends Nodo{
    private String estadoEspecifico;

    Industria(String estadoComun, String estadoEspecifico) {
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
