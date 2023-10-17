import domain.Grafo;
import services.Convertidor;
import services.CreadorDeConvertidor;
import services.ServicioExportacion;

public class Cliente {
    public static void main(String[] args) {
        ServicioExportacion servicioExportacion = new ServicioExportacion();
        String formato = servicioExportacion.exportarAFormato("xml");
        System.out.println(formato);
    }
}