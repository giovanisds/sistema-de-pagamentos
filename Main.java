public class Main {
    public static void main(String[] args) {
        System.out.println("Veículos processados:");

        Veiculo carro = new Carro();
        Veiculo caminhao = new Caminhao(4);
        Veiculo moto = new Moto();

        RelatorioPedagio.processarVeiculo(carro);
        RelatorioPedagio.processarVeiculo(caminhao);
        RelatorioPedagio.processarVeiculo(moto);

        RelatorioPedagio.exibirTotalVeiculos();
        RelatorioPedagio.exibirTotalArrecadado();
    }
}