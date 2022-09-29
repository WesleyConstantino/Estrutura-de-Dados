/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertefila;

public class InverteFila {
    public static void main(String[] args) {

        Fila f1 = new Fila(6);

        try {
            f1.enqueue("Wesley");
            f1.enqueue("Natalia");
            f1.enqueue("Fábio");            
            //f1.dequeue(); *O método dequeue tira elementos da fila
            f1.enqueue("Richard");          
            f1.enqueue("Petter");
            f1.enqueue("Daniel");  
            
             System.out.println("Primeiro da fila: " + f1.front());
             System.out.println("Último da fila: " + f1.and());
             
             Pilha aux = new Pilha(6);
            while(!f1.isEmpty()){
                aux.push(f1.front());
                f1.dequeue();
            }

             while(!aux.isEmpty()){
                f1.enqueue(aux.top());
                aux.pop();
            }

            
            
           System.out.println("Primeiro da fila: " + f1.front());
           System.out.println("Último da fila: " + f1.and());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

