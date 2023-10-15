package domain;

import java.util.List;

public class LugarTurismo extends Nodo{

    private String estadoEspecifico;

    LugarTurismo(String estadoComun, String estadoEspecifico) {
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
