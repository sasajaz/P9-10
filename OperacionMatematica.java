class OperacionMatematica {
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("No es posible dividir entre cero");
        }
        return numerador / denominador;
    }
}

