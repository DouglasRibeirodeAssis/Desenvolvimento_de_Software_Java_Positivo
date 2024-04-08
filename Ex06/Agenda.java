public class Agenda {
    private Contato[] contatos;
    private int numeroContatos;

    public Agenda(int tamanhoMaximo) {
        this.contatos = new Contato[tamanhoMaximo];
        this.numeroContatos = 0;
    }

    public void adicionarContato(Contato novoContato) {
        if (numeroContatos < contatos.length) {
            contatos[numeroContatos] = novoContato;
            numeroContatos++;
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais contatos.");
        }
    }

    public Contato buscarContato(String nome) {
        for (int i = 0; i < numeroContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i];
            }
        }
        return null;
    }
}
