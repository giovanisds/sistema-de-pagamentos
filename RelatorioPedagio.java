public class RelatorioPedagio {
    private static int totalVeiculos = 0;
    private static double totalArrecadado = 0.0;

    public static void processarVeiculo(Veiculo v) {
        double valor = v.calcularPedagio();
        totalVeiculos++;
        totalArrecadado += valor;

        if (v instanceof Caminhao) {
            Caminhao c = (Caminhao) v;
            System.out.printf("%s = R$ 10,00 base + R$ 2,00 × %d eixos = R$ %.2f%n",
                v.getTipo(), c.getEixos(), valor);
        } else {
            System.out.printf("%s = R$ %.2f%n", v.getTipo(), valor);
        }
    }

    public static void exibirTotalVeiculos() {
        System.out.println("\nTotal de veículos processados: " + totalVeiculos);
    }

    public static void exibirTotalArrecadado() {
        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
    }
}