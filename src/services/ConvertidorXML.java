package services;

import java.util.List;

public class ConvertidorXML implements Convertidor{

    @Override
    public String exportarFormato(List<String> argumentos, List<String> infoDestinos) {
        StringBuilder formatoBuilder = new StringBuilder(String.format("<%s>",argumentos.get(0)));
        formatoBuilder.append(String.format("<estadoComun>%s</estadoComun>",argumentos.get(1)));
        formatoBuilder.append(String.format("<estadoEspecifico>%s</estadoEspecifico>",argumentos.get(2)));
        for (String destino: infoDestinos) {
            formatoBuilder.append(String.format("<destino>%s</destino>",destino));
        }
        formatoBuilder.append(String.format("</%s>",argumentos.get(0)));
        return formatoBuilder.toString();
    }
}
