
public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("Rua das Pizzas, 111", 10);

        Pizza pizzaUm = new Pizza("Mussarela", 25.0, new String[]{"Molho de tomate", "Mussarela"});
        Pizza pizzaDois = new Pizza("Calabresa", 30.0, new String[]{"Molho de tomate", "Calabresa", "Cebola"});

        pedido.adicionarPizza(pizzaUm);
        pedido.adicionarPizza(pizzaDois);

        pedido.gerarRelatorio();
    }
}
