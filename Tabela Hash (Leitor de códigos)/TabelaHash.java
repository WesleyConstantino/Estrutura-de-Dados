/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade8;

/**
 *
 * @author x601533
 */
import java.util.LinkedList;
import java.util.ArrayList;

 public class TabelaHash{
   final private int Tam = 10;
   ArrayList<LinkedList<Produto>> prod = new ArrayList<>(Tam);
   int size = 0;

   TabelaHash(){
       int i = 0;
       while(i < Tam){
         prod.add(new LinkedList<>());
         i++;
       }
    } 
    int size()
    {
      return this.size;
    }
    
    void inserir(Produto p)
    {
       try{
            int index = p.getHash();
            prod.get(index).add(p);
            size ++;
            }catch(Exception e){
             System.err.println("Erro: " + e);
           }
    }

}
