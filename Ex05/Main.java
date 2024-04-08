
public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro("Volkswagen", "Golf", 2011, "QWE2213", 0);

        carroUm.acelerar();
        carroUm.exibirInfo();
        carroUm.frear();
        carroUm.exibirInfo();
    }
}
