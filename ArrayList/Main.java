import java.util.ArrayList; //importação necessária para trabalhar com ArreyList

public class Main
{
   public static void main(String[] args){
       
     ArrayList<String> clientes = new ArrayList<String>();

     clientes.add("Wesley"); //add() adiciona           
     clientes.add("Anna"); 
     clientes.add("Bill"); 
     clientes.remove(1); //remove() remove o item de um determinada posição, aqui a posição 1
     
           
    System.out.println(clientes.isEmpty()); //isEmpty() retorna "True" ou "False" para se o arrey está vazio
    System.out.println(clientes.get(0)); //get() retorna o ´tem de um determinada posição, aqui o 0     
    System.out.println(clientes.contains("Wesley")); //contains() retorna "True" ou "False" para se um determinado nome existe no array
    System.out.println(clientes.size()); //size() retorna o tamanho do array
    System.out.println(clientes.indexOf("Wesley")); //indexOf() retorna a posição de um dado, nesse caso posição "0"
  }
}
