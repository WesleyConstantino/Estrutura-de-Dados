package vetor;

import java.util.Scanner;

public class Vetor {


    public static void main(String[] args) {
      int[] MeuVetor = new int[10]; //Declaração de um vetor do tipo int de 10 posições
      
      Scanner leitor = new Scanner(System.in);
      
      //O "for" abaixo gera números aleatórios automáticamente no vetor
      for(int i = 0; i < MeuVetor.length; i++){
          MeuVetor[i] = (int) (Math.random() * 20); //"Math.random()" gera números aleatórios, no caso "* 20" entre 0 e 20. "(int)" é necessário para fazer a conversão
          System.out.println(MeuVetor[i]);          //Sendo assim, "(int) (Math.random() * 20);" significa "(CONVERSÂO) (Math.random() * NÚMERO QUALQUER);"
    }
      
      System.out.println("Qual número você deseja saber se existe no vetor?");
      int pesquisaNumero = leitor.nextInt();  //Entrada de dados do Scanner
     
                 //BUSCA LINEAR
                 //Compexidade O(n)
      //Todo o código abaixo faz uma busca linear
      boolean encontrouNumero = false;
      for(int i = 0; i < MeuVetor.length; i++){
          if(MeuVetor[i] == pesquisaNumero){ 
            encontrouNumero = true;
            break; 
        }
      }
      if(encontrouNumero == true){
          System.out.println("Encontrou!");
      }
      else {
          System.out.println("Não encontrou!");
      }
    }
    
}
