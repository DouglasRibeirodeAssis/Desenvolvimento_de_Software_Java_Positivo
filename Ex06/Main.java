
public class Main {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda(10);

        Contato contato1 = new Contato("Douglas", "111111111");
        Contato contato2 = new Contato("Maria", "222222222");

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);

        Contato resultadoBusca = minhaAgenda.buscarContato("João");
        if (resultadoBusca != null) {
            System.out.println("Contato encontrado: " + resultadoBusca.getNome() + ", Tel: " + resultadoBusca.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
