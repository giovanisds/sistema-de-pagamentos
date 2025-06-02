public class Moto implements Veiculo {
    private static final double VALOR_BASE = 2.50;

    @Override
    public double calcularPedagio() {
        return VALOR_BASE;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}