/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertefila;

public class Fila extends Vetor {

    
    public Fila(int capacity) {        
        super(capacity);
    }

    public int size() {
    // Devolve o número de elementos da fila
        return super.size();
    }

    public void enqueue(String n) throws Exception {
    // Enfileira, caso a fila não esteja cheia, o elemento n
        add (size(),n);
    }

    public void dequeue() throws Exception {
    // Desenfileira, caso a fila não esteja vazia, o primeiro elemento
        remove(0);
        
    }

    public String front() throws Exception{
	// Devolve, sem desenfileirar, o primeiro elemento da fila
        return get(0);
    }    
    
        public String and() throws Exception{
	// Devolve, o útimo elemeto da elemento da fila
        return get(5);
    }
}
