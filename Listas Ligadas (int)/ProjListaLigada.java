package listaligada;


public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada numeroInteiro = new ListaLigada();
        try {
            numeroInteiro.addFirst(new Node(1));
            numeroInteiro.addFirst(new Node(2));
            numeroInteiro.addLast(new Node(3));
            numeroInteiro.addLast(new Node(4));
            numeroInteiro.addFirst(new Node(5));
//            numeroInteiro.addAfter(new Node(6), 7);
//            animais.addAfter(new Node(3), 2);
//            animais.addBefore(new Node(4), 7);
//            animais.addBefore(new Node(4), 3);
//            animais.addBefore(new Node(3), 2);
            numeroInteiro.mostraLista();
            System.out.println("Tamanho da lista: " + numeroInteiro.size());
            numeroInteiro.remove(1);
            numeroInteiro.mostraLista();
            System.out.println("Tamanho da lista: " + numeroInteiro.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
