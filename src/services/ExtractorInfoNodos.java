package services;

import domain.Enlace;
import domain.Nodo;

import java.util.ArrayList;
import java.util.List;

public class ExtractorInfoNodos {

    private Convertidor convertidor;

    public String exportarInfoNodoCiudad(Nodo nodo){
        List<String> infoCiudad = nodo.funcInfoGeo();
        List<String> infoDestinos = obtenerDestinos(nodo);
        String casoEspecifico = infoCiudad.remove(3);
        if(casoEspecifico.equals("repite una letra")){
            infoCiudad.set(0, "Ciudadd");
        }
        ArrayList<String> argumentos = new ArrayList<>(infoCiudad);
         return convertidor.exportarFormato(argumentos,infoDestinos);
    }

    public String exportarInfoNodoIndustria(Nodo nodo){
        List<String> infoIndustria = nodo.funcInfoGeo();
        List<String> infoDestinos = obtenerDestinos(nodo);
        String casoEspecifico = infoIndustria.remove(3);
        if(casoEspecifico.equals("repite dos letra")){
            infoIndustria.set(0, "Industriaa");
        }
        ArrayList<String> argumentos = new ArrayList<>(infoIndustria);
        return convertidor.exportarFormato(argumentos,infoDestinos);
    }

    public String exportarInfoNodoLugarTurismo(Nodo nodo){
        List<String> infoLugarTurismo = nodo.funcInfoGeo();
        List<String> infoDestinos = obtenerDestinos(nodo);
        String casoEspecifico = infoLugarTurismo.remove(3);
        if(casoEspecifico.equals("repite tres letra")){
            infoLugarTurismo.set(0, "LugarTurismoooo");
        }
        ArrayList<String> argumentos = new ArrayList<>(infoLugarTurismo);
        return convertidor.exportarFormato(argumentos, infoDestinos);
    }

    public void setConvertidor(Convertidor convertidor) {
        this.convertidor = convertidor;
    }

    private List<String> obtenerDestinos(Nodo nodo){
        List<Enlace> enlaces = nodo.getEnlaces();
        List<String> infoDestinos = new ArrayList<>();
        for (Enlace enlace:enlaces) {
            infoDestinos.add(enlace.getDestino().funcInfoGeo().get(2));
        }
        return infoDestinos;
    }
}
