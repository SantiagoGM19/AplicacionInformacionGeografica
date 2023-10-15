import domain.Grafo;
import services.Convertidor;
import services.CreadorDeConvertidor;
import services.ServicioExportacion;

public class Cliente {
    public static void main(String[] args) {
        CreadorDeConvertidor creadorDeConvertidor = new CreadorDeConvertidor();
        Grafo grafo = new Grafo();
        Convertidor convertidorXml = creadorDeConvertidor.crearConvertidor("xml");
        ServicioExportacion servicioExportacion = new ServicioExportacion(convertidorXml);
        String formato = servicioExportacion.exportar(grafo);
        System.out.println(formato);
    }
}