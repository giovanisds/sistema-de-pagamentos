public class RelatorioPedagio {
    private static int totalVeiculos = 0;
    private static double totalArrecadado = 0.0;

    public static void processarVeiculo(Veiculo v) {
        double valor = v.calcularPedagio();
        totalVeiculos++;
        totalArrecadado += valor;

        System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", v.getTipo(), valor);
    }

    public static void exibirTotalVeiculos() {
        System.out.println("\n==== RELATÓRIO DO PEDÁGIO ====");
        System.out.println("Total de veículos: " + totalVeiculos);
    }

    public static void exibirTotalArrecadado() {
        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
    }
}