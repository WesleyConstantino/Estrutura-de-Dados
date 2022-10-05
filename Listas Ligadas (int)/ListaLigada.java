package listaligada;

public class ListaLigada {

    private Node header; // início da lista ligada
    private Node trailer; // fim da lista ligada
    private int size;    // quantidade de elementos na lista ligada
    private Node meio;
    
//    public void meio(Node novoNumeroInteiro) {
//    // retorna o meio da lista	
//        if (isEmpty()) {
//         // a lista está vazia
//           meio = novoNumeroInteiro;
//        } else {
//            // já existe pelo menos um animal na lista
//            
//            meio = ;
//        }
//  }
    
//    public void mostraMeio() {
//
//      int i = 0;
//        while (i <= size / 2) {
//        i++;
//    }
//    meio = ;
//}
    
    public ListaLigada() {
        // construtor - cria uma lista vazia
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        // retorna o tamanho da lista	
        return size;
    }
    

    public boolean isEmpty() {
        // verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node first() {
        // retorna o Nó inicial da lista
        return header;
    }

    public Node last() {
        // retorna o nó final da lista
        return trailer;
    }

    public void addFirst(Node novoNumeroInteiro) {
        // adiciona um animal no início da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoNumeroInteiro;
            trailer = novoNumeroInteiro;
        } else {
            // já existe pelo menos um animal na lista
            novoNumeroInteiro.next = header;
            header = novoNumeroInteiro;
        }
        size++;
    }

    public void addLast(Node novoNumeroInteiro) {
        // adiciona um animal no final da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoNumeroInteiro;
            trailer = novoNumeroInteiro;
        } else {
            // já existe pelo menos um animal na lista
            trailer.next = novoNumeroInteiro;
            trailer = novoNumeroInteiro;
        }
        size++;
    }

            
    public void mostraLista() {
        //mostra todos os elementos da lista
        Node aux = header;
        header.mostraNumeroInteiro();
        while (aux.next != null) {
            aux = aux.next;
            aux.mostraNumeroInteiro();
        }
        System.out.println("Fim da Lista!");
    }

    public void addAfter(Node novoNumeroInteiro, int pos) throws Exception {
        // adiciona o nó novoAnimal depois do animal indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o final da lista
            if (trailer.numeroInteiro == (pos)) {
                addLast(novoNumeroInteiro);
            } else {
                // procura a posição de inserção
                Node aux;
                for (aux = header; aux.next != null; aux = aux.next) {
                    if (aux.numeroInteiro == (pos)) {
                        novoNumeroInteiro.next = aux.next;
                        aux.next = novoNumeroInteiro;
                        size++;
                    }
                }
            }
        }
    }

    public void addBefore(Node novoNumeroInteiro, int pos) throws Exception {
        // adiciona o nó novoAnimal antes do animal indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o início da lista
            if (header.numeroInteiro == (pos)) {
                addFirst(novoNumeroInteiro);
            } else {
                // procura a posição de inserção
                Node aux, ant = null;
                for (aux = header; !(aux.numeroInteiro == (pos)); aux = aux.next) {
                    ant = aux;
                }
                ant.next = novoNumeroInteiro;
                novoNumeroInteiro.next = aux;
                size++;
            }
        }
    }

    public void remove(int numero) throws Exception {
        // remove o animal indicado como parâmetro
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se o animal a ser removido é o primeiro da lista
            if (header.numeroInteiro == (numero)) {
                header = header.next;
            } else {
                // procura pelo animal que será removido
                Node aux, ant = null;
                for (aux = header; !(aux.numeroInteiro == (numero)); aux = aux.next) {
                    ant = aux;
                }
                ant.next = aux.next;
            }
            size--;
        }
    }    
}
