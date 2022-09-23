package vetor;

import java.util.Scanner;

public class Vetor {


    public static void main(String[] args) {
      String[] MeuVetor = new String[5]; //Declaração de um vetor do tipo String de 5 posições
      MeuVetor[0] = "Wesley"; //Adicionando dado na posição 0 do vetor
      MeuVetor[2] = "Petter";
      MeuVetor[1] = "Harry";
      MeuVetor[3] = "Nelson";
      
      Scanner leitor = new Scanner(System.in);
      
      System.out.println("Qual nome você deseja saber se existe na lista?");
      String pesquisaNome = leitor.nextLine(); //Entrada de dados do Scanner
      
      boolean encontrouNome = false; //essa variável só ficará true se o nome digitado pelo usuário for encontrado no vetor
      //O laço "for" abaixo verifica se o nome digitado pelo usuário existe no vetor (Busca linear, ou seja, procura de posição em posição)
      for(int i = 0; i < MeuVetor.length; i++){
        String nomes = MeuVetor[i];
        if(nomes.equalsIgnoreCase(pesquisaNome)){ //equalsIgnoreCase ignora de a String é maiúscula ou minúscula
            encontrouNome = true;
            break; //break encerra o loop
        }
      }
      if(encontrouNome == true){
          System.out.println("Encontrou!");
      }
      else {
          System.out.println("Não encontrou!");
      }
    }
    
}
