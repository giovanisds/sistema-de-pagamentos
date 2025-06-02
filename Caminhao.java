public class Caminhao implements Veiculo {
    private static final double VALOR_BASE = 10.00;
    private static final double VALOR_EIXO = 2.00;
    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio() {
        return VALOR_BASE + VALOR_EIXO * eixos;
    }

    @Override
    public String getTipo() {
        return "Caminhao(" + eixos + ")";
    }

    public int getEixos() {
        return eixos;
    }
}