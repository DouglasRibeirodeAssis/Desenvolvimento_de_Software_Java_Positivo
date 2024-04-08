
public class Main {
        
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Douglas Ribeiro", 0, 1);

        jogador1.aumentarPontuacao(100);
        jogador1.subirNivel();
        jogador1.exibirInfo();
    }
}
