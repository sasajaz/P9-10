public class Ejercicio1{
    public static void main(String[] args) {
        OperacioneMatematica operacion= new OperacioneMatematica();
        try{
            double resultado=operacion.raizCuadrada(-9);
            System.out.println("Resultado: "+ resultado);
        } catch(RaizNegativaException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}