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

    }
