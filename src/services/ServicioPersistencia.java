package services;

import domain.*;

public class ServicioPersistencia {

    /**
     * Se van a quemar los valores haciendo una especie de mock de BD.
     * Esto es por efectos de simplicidad para el ejercicio.
     * En un proyecto real por supuesto la implementación sería distinta.
     * */
    public Grafo obtenerMapa(){
        try{
            Grafo grafo = new Grafo();
            Nodo nodo1 = grafo.agregarNodo("ciudad", "USA", "New York");
            Nodo nodo2 = grafo.agregarNodo("industria", "USA", "Fabrica textil");
            Nodo nodo3 = grafo.agregarNodo("lugarTurismo", "USA", "Gran cañon");
            grafo.agregarEnlace(nodo1, nodo2);
            grafo.agregarEnlace(nodo1, nodo3);
            grafo.agregarEnlace(nodo2, nodo3);
            return grafo;
        }catch (Error e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
