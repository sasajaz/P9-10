package mx.unam.fi.poo.p9;
/**
 * Excepción para cuando no hay vocales en la cadena
 */
class NoVocalesException extends Exception {
    /**
     * Método Constructor para el mensaje de error
     *
     * @param mensaje Mensaje que dice el error.
     */
    public NoVocalesException(String mensaje) {
        super(mensaje);
    }
}