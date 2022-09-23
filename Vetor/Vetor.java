package vetor;


public class Vetor {


    public static void main(String[] args) {
      String[] MeuVetor = new String[5]; //Declaração de um vetor do tipo String de 5 posições
      MeuVetor[0] = "Wesley"; //Adicionando dado na posição 0 do vetor
      MeuVetor[2] = "Petter";
      MeuVetor[1] = "Harry";
      MeuVetor[3] = "Nelson";
      
      System.out.println("Posição 1 do vetor = " + MeuVetor[0]); //Imprimindo dados de uma posição específica
      
      //O laço "for" abaixo imprime tudo o que tem dentro do meu vetor
      for(int i = 0; i < MeuVetor.length; i++){
         System.out.println("Posição " + i + " do vetor = " + MeuVetor[i]);   
      }
    }
    
}
