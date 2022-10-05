package listaligada;

public class Node {
    int numeroInteiro;	// elemento armazenado no nó
    Node next;	// próximo elemento da lista... que também é do tipo Node

    public Node(int numeroInteiro) {
        // construtor	
        this.numeroInteiro = numeroInteiro;
        next = null;
    }
    
    public void mostraNumeroInteiro(){
        System.out.println("Número: " + numeroInteiro);
    }
}
