public class Carro implements Veiculo {
    private static final double VALOR_BASE = 5.00;

    @Override
    public double calcularPedagio() {
        return VALOR_BASE;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}