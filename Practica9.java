package mx.unam.fi.poo.p9;
/**
 * Clase main
 */
public class Practica9{
    /**
     * Método main que usa RevisarVocales para ver si la cadena tiene o no vocales,
     *
     * @param args argumentos.
     */
    public static void main(String[] args) { 
        RevisarCadena cad= new RevisarCadena();
        try {
            cad.RevisarVocales("'Mrclg n cv'");
        } catch (NoVocalesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

