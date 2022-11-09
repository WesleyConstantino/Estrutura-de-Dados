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
    private String descricao, codigo;
    private double preco;

    public Produto(String codigo, String descricao, double preco) throws ProdutoInvalido {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        if(!Validacao())
           throw new ProdutoInvalido("O produto digitado é inválido!");
    }
    //*******************************************************************************************

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
       return !descricao.isEmpty() && codigo.length() == 13 && preco > 0.0; 
    }
    static int getCountryCode(String codigo)
    {
      int a = codigo.charAt(0);
      int b = codigo.charAt(1);
      int c = codigo.charAt(2);
      int code;

      a = a - '0';
      b = b - '0';
      c = c - '0';
      code = a * 100 + b * 10 + c;
      return code;
    }
    int getCountryCode()
    {
      return getCountryCode(this.codigo);
    }
    int getHash()
    {
      return getHash(codigo); 
    }
    static int getHash(String codigo){
       int code = getCountryCode(codigo);
       int resto = (code % 10);
       return resto;
    }
    @Override
    public String toString()
    {
      return this.getCodigo() + " - " + this.getDescricao() + "preço = " + this.getPreco();
    }
}
