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
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Teste{

     public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       TabelaHash tabela = new TabelaHash();
       TreeMap<Integer, Integer> countries = new TreeMap<>();

               int opc = 0;

        while (opc != 3) {
            System.out.println("MENU");
            System.out.println("1- Inserir Produto");
            System.out.println("2- Contagem de códigos do mesmo país");
            System.out.println("3- Encerrar");
            do {
                opc = scan.nextInt();
            } while (opc < 1 || opc > 3);

           String code; 
           String desc;
           double preco;

            if (opc == 1) {
                    System.out.println("Informe o código: ");
                    code = scan.next();
                    
                    System.out.println("Informe a descrição: ");
                    desc = scan.next();

                    System.out.println("Informe o preço: ");
                    preco = scan.nextDouble();

                    scan.nextLine();

                    try{
                        tabela.inserir(new Produto(code, desc, preco));
                        int country = Produto.getCodPais(code);
                        if(countries.containsKey(country)){
                           int count = countries.get(country);
                           count++;
                           countries.replace(country, count);
                        }
                    else{
                         countries.put(country, 1);
                         }
                    }catch(ProdutoInvalido e){
                        System.err.println(e);
                     }
            }

            if (opc == 2) {
                     System.out.println(countries.toString());
            }

        }

    }

}
            
