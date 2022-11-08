/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.produtohash;



class InvalidProduct extends Exception
{
   public InvalidProduct(String erro)
   {
      super(erro);
   }
}

public class Produto {
    private String cod;
    private String descricao;
    private double preco;

    public Produto(String cod, String descricao, double preco) throws InvalidProduct {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
        if(!isValid())
           throw new InvalidProduct("produto inválido");
    }
    //*******************************************************************************************

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
