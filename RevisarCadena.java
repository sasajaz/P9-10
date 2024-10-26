package mx.unam.fi.poo.p9;
import java.util.*;

/**
 * Clase RevisarCadena
 */
class RevisarCadena {
    /**
     * Método que revisa si la cadena contiene vocales o no.
     *
     * @param cad La cadena a revisar.
     * @throws NoVocalesException por si no hay vocales en la cadena.
     */
    public static void RevisarVocales(String cad) throws NoVocalesException {
        int v = 0;
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' ||c == 'i' || c == 'O' || c == 'o' || c == 'u' || c == 'U') {
                v++;
            }
        }

        if (v == 0) {
            throw new NoVocalesException("La cadena no contiene ninguna vocal.");
        }
        System.out.println("La cadena " + cad + " contiene vocales.");
    }
}