public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int valor) {
        if (valor > 0) {
            pontuacao += valor;
        } else {
            System.out.println("Valor de pontuação inválido.");
        }
    }

    public void subirNivel() {
        nivel++;
    }

    public void exibirInfo() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

}

