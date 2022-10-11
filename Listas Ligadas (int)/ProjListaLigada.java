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
            numeroInteiro.mostraLista();
            System.out.println("Tamanho da lista: " + numeroInteiro.size());
            //chamada da minha função que retorna o elemento central da minha lista ligada
            elementoCentral(numeroInteiro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Função que retorna o elemento central da minha lista ligada
    static void elementoCentral(ListaLigada lista){
        int tamanho = lista.size();
        int elemCentral = tamanho/2;
        Node proxNo = lista.first();
        for(int i = 0; i <= elemCentral; i++)
        proxNo = proxNo.next;
        System.out.println("O elemento central é:" + proxNo.numeroInteiro);
    }
}
