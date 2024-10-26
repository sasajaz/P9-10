class OperacioneMatematica{
    public double raizCuadrada(double numero) throws RaizNegativaException{
        if (numero<0){
            throw new RaizNegativaException("No se puede calcular una raiz negativa");
        }
        return Math.sqrt(numero);
    }
}