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
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Atividade8{

     public static void main(String[] args){
       int i = 0;
       Scanner s = new Scanner(System.in);
       TabelaHash th = new TabelaHash();
       TreeMap<Integer, Integer> countries = new TreeMap<>();

       do{
           String code, desc;
           double preco;

           i = menu();
           switch(i){
                case 1:
                    System.out.println("código: ");
                    code = s.nextLine();
                    System.out.println("descrição: ");
                    desc = s.nextLine();
                    System.out.println("preço: ");
                    preco = s.nextDouble();
                    s.nextLine();
                    try{
                        th.insert(new Produto(code, desc, preco));
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
                    break;                 
           
                case 2:
                {
                    System.out.println("código: ");
                    code = s.nextLine();    
                    th.remove(code);
                    int count = countries.get(Produto.getCodPais(code)); 
                    countries.put(Produto.getCodPais(code), --count);
                    break; 
                }
                case 3:
                {
                    System.out.println("código: ");
                    code = s.nextLine(); 
                    Produto p = th.consulta(code); 
                    System.out.println(p); 
                    break;                
                }
                case 4:
              
                    System.out.println(th.size());
                    break;  
              
                case 5:

                    th.mostraTabela();
                    break;  

                case 6:

                    System.out.println(countries.toString());
                    break; 
                    default:
                     break; 
                }
           }while (i != 0);
       }
       static int menu(){
            Scanner s = new Scanner(System.in);

            System.out.println("Entre com uma opção: ");
            System.out.println("0 - sair");
            System.out.println("1 - adicionar produto");
            System.out.println("2 - remover produto");
            System.out.println("3 - consultar produto");
            System.out.println("4 - obter tamanho da tabela");
            System.out.println("5 - visualizar tabela");
            System.out.println("6 - contagem de códigos");

            int i = 0;
            do{
                i = s.nextInt();
              } while (i < 0 || i > 6);
              return i;
        }
  }
