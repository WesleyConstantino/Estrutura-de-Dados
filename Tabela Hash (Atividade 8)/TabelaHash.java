/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.produtohash;

import java.util.ArrayList;
import java.util.LinkedList;

 public TabelaHash{
   final private int MAX = 10;
   ArrayList<LinkedList<Produto>> produtos = new ArrayList<>(MAX);
   int size = 0;
   TabelaHash(){
       int i = 0;
       while(i < MAX){
         produtos.add(new LinkedList<>());
         i++;
       }
    } 
    int size()
    {
      return this.size;
    }
    void insert(Produto p)
    {
        try{
             int index = p.getHash();
             produtos.get(index).add(p);
             size ++;
            }catch(Exception e){
               System.err.println("Erro: " + e);
            }
    }
    void remove(String code){
        try{
             int index = Produto.getHash(code);
             LinkedList<Produto> l = produtos.get(index);
             Boolean found = false;
             if(l != null){
                for(int i = 0; i < l.size(); i++){
                    Produto pp = l.get(i);
                    if(pp.getCodigo().equals(code)){
                      l.remove(i);
                      size --;
                      found = true;
                    }
                }
             }
             if(!found){
                 System.out.println("produto - "+ code + "not found!");
             }
             else
                 System.out.println("produto - "+ code + "removido com sucesso!");
 
            }catch(Exception e){
               System.err.println("Erro: " + e);
            }
    }
    Produto consulta(String code)
    {
       Produto res = null;
       int index = Produto.getHash(code);
       LinkedList<Produto> l = produtos.get(index);
       Boolean found= false;
       if(l != null){
          for(int i = 0; i < l.size(); i++){
             Produto p = l.get(i);
             if(p.getCodigo().equals(code)){
                 res = p;
                 found = true;
             }
          }
       }
       return resp;
    }
    void mostraTabela()
    {
      for(int i = 0; i < MAX; i++){
          LinkedList<Produto> l = produtos.get(i);  
          for(int j=0; l != null && j < l.size(); j++){
              Produto p = l.get(j);
              System.out.println("produto " + i + ", " + j + ": " +p);
          } 
        }
      }
    }
