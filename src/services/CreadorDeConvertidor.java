package services;

public class CreadorDeConvertidor {

    public Convertidor crearConvertidor(String tipoConvertidor){
        switch (tipoConvertidor.toLowerCase()){
            case "xml":
                return new ConvertidorXML();
            default:
                return null;
        }
    }
}
