
public class Main {
        
    public static void main(String[] args) {

        ContaBancaria contaUm = new ContaBancaria(12345, "Douglas Ribeiro", 1500.0);

        System.out.println("Saldo inicial da conta: " + contaUm.consultarSaldo());

        contaUm.depositar(100.0);
        System.out.println("Saldo após depósito: " + contaUm.consultarSaldo());

        contaUm.sacar(300.0);
        System.out.println("Saldo após saque: " + contaUm.consultarSaldo());

        contaUm.sacar(2000.0); 

        contaUm.depositar(1200);

        contaUm.sacar(2000.0); 

        System.out.println(contaUm.consultarSaldo()
        );
    }
}
