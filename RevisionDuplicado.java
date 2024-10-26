import java.util.*;
class RevisionDuplicado {
    public static void checarDuplicado(List<Integer> numeros) throws NumeroDuplicadoException {
        Set<Integer> numerosUnicos = new HashSet<>();
        for (int num : numeros) {
            if (numerosUnicos.contains(num)) {
                throw new NumeroDuplicadoException("Número duplicado encontrado: " + num);
            }
            numerosUnicos.add(num);
        }
    }
}