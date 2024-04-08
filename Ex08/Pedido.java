public class Pedido {
    private Pizza[] pizzas;
    private String enderecoEntrega;
    private int numeroDePizzas;

    public Pedido(String enderecoEntrega, int capacidade) {
        this.enderecoEntrega = enderecoEntrega;
        this.pizzas = new Pizza[capacidade];
        this.numeroDePizzas = 0;
    }

    public void adicionarPizza(Pizza pizza) {
        if (numeroDePizzas < pizzas.length) {
            pizzas[numeroDePizzas] = pizza;
            numeroDePizzas++;
        } else {
            System.out.println("Limite de pizzas atingido.");
        }
    }

    public void cancelarPedido() {
        pizzas = new Pizza[pizzas.length];
        numeroDePizzas = 0;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < numeroDePizzas; i++) {
            valorTotal += pizzas[i].getValor();
        }
        return valorTotal;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório do Pedido");
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Número de Pizzas: " + numeroDePizzas);
        System.out.println("Valor Total do Pedido: R$ " + calcularValorTotal());
    }
}
