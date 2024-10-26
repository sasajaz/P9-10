import java.util.*;
public class ejercicio2 {

    public static void main(String[] args) {
        try {
            List<Integer> numeros = IngresaUsuario.leerNumeroUsuario();
            RevisionDuplicado.checarDuplicado(numeros);
            System.out.println("¡No hay numeros duplicados!");
        } catch (NumeroDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}