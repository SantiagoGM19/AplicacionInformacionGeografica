package services;

import domain.*;

public class ServicioPersistencia {

    /**
     * Se van a quemar los valores haciendo una especie de mock de BD.
     * Esto es por efectos de simplicidad para el ejercicio.
     * En un proyecto real por supuesto la implementación sería distinta.
     * */
    public Grafo obtenerMapa(){
        Grafo grafo = new Grafo();
        Nodo ciudad =  new Ciudad("USA", "New York");
        Nodo industria = new Industria("USA", "Fabrica textil");
        Nodo lugarTurismo = new LugarTurismo("USA", "Gran cañon");
        grafo.agregarNodo(ciudad);
        grafo.agregarNodo(industria);
        grafo.agregarNodo(lugarTurismo);
        Enlace enlace1 = new Enlace(ciudad, industria);
        Enlace enlace2 = new Enlace(ciudad, lugarTurismo);
        Enlace enlace3 =  new Enlace(lugarTurismo, industria);
        grafo.agregarEnlace(enlace1);
        grafo.agregarEnlace(enlace2);
        grafo.agregarEnlace(enlace3);
        return grafo;
    }
}
