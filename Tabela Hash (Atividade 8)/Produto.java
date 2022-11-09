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
class ProdutoInvalido extends Exception
{
   public ProdutoInvalido(String erro)
   {
      super(erro);
   }
}

public class Produto {
    private String descricao, cod;
    private double preco;

    public Produto(String cod, String descricao, double preco) throws ProdutoInvalido {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
        if(!Validacao())
           throw new ProdutoInvalido("O produto digitado é inválido!");
    }
    //*******************************************************************************************

    public String getCodigo() {
        return cod;
    }

    public void setCodigo(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    boolean Validacao()
    {
       return !descricao.isEmpty() && cod.length() == 13 && preco > 0.0; 
    }

    static int getCodPais(String cod)
    {
      int c1 = cod.charAt(0);
      int c2 = cod.charAt(1);
      int c3 = cod.charAt(2);
      int codigo;

      c1 = c1 - '0';
      c2 = c2 - '0';
      c3 = c3 - '0';
      codigo = c1 * 100 + c2 * 10 + c3;
      return codigo;
    }

    int getCodPais()
    {
      return getCodPais(this.cod);
    }

    int getHash()
    {
      return getHash(cod); 
    }

    static int getHash(String codigo){
       int code = getCodPais(codigo);
       int resto = (code % 10);
       return resto;
    }

    @Override
    public String toString()
    {
      return this.getCodigo() + " - " + this.getDescricao() + "preço = " + this.getPreco();
    }
}
