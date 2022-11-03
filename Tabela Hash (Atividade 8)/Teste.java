/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.produtohash;


public class Teste {

   public static void main(String[] args) {
        Produto prod = new Produto(10);
        Scanner ent = new Scanner(System.in);
        int opc = 0;
        while (opc != 3) {
            System.out.println("MENU");
            System.out.println("1- Inserir Produto");
            System.out.println("2- Mostrar o nome do país");
            System.out.println("3- Encerrar");
            do {
                opc = ent.nextInt();
            } while (opc < 1 || opc > 3);

            String cod, descricao;
            double preco;

            if (opc == 1) {
                System.out.println("Informe o código do produto: ");
                cod = ent.next();
                cod = cod.toUpperCase(); //retorna o valor da string convertido para letras maiúsculas.
                while(cod.length != 13) {
                 System.out.println("O código do produto devo conter 13 dígitos : ");
                 System.out.println("Informe o código do produto : ");
                 cod = ent.next();
                 cod = cod.toUpperCase();
                }

                System.out.println("Informe a descrição do produto: ");
                descricao = ent.next();
                descricao = descricao.toUpperCase();
                System.out.println("Informe o preço do produto: ");
                preco = ent.nextDouble();
                prod.insere(new Produto(palavra, traducao, preco));
            }
//********************************************************************************************
//            if (opc == 2) {
//                System.out.println("Informe a palavra que será removida: ");
//                palavra = ent.next();
//                palavra = palavra.toUpperCase();
//                ingles.remove(palavra);
//            }
//********************************************************************************************

        }

    }

}
