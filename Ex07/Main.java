
public class Main {
    public static void main(String[] args) {

        Produto[] estoque = new Produto[3];

        estoque[0] = new Produto("Arroz", 101, 10.0, 50);
        estoque[1] = new Produto("Feijão", 102, 8.0, 30);
        estoque[2] = new Produto("Macarrão", 103, 5.0, 40);

        System.out.println("======= Estoque Atual =======");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        estoque[1].setQuantidade(50);

        System.out.println("\n======= Estoque Atualizado =======");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        double valorTotalEstoque = 0;
        for (Produto produto : estoque) {
            valorTotalEstoque += produto.calcularValorTotal();
        }
        System.out.println("\nValor Total em Estoque: R$ " + valorTotalEstoque);
    }
}
