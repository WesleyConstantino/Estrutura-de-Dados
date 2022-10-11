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
            //Finção que retorna a minha lista ligada (sem inverter)
            numeroInteiro.mostraLista();
            print();
            //chamada da minha função que retorna o elemento central da minha lista ligada
            elementoCentral(numeroInteiro);
            print();
            //chamada da minha função que inverte a minha lista ligada
            ListaLigada listaInvertida = inverteLista(numeroInteiro);
            listaInvertida.mostraLista();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        //função para imprimir um print em tela
        static void print(){
        System.out.println("*********************************************************");
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
    
    //Função que inverte a minha lista ligada
    static ListaLigada inverteLista(ListaLigada lista){
        Node ProxNo = lista.first();
        ListaLigada listaInvertida = new ListaLigada();
        
        while(ProxNo != null){
            Node no = new Node(ProxNo.numeroInteiro);
            listaInvertida.addFirst(no);
            ProxNo = ProxNo.next;
        }
        return listaInvertida;
        
    }
}
