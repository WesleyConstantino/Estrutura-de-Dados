public class ED_Aplic8{

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
                        int country = Produto.getCountryCode(code);
                        if(countries.containsKey(country)){
                           int count = countries.get(country);
                           count++;
                           countries.replace(country.count);
                        }
                    else{
                         countries.put(country, l);
                         }
                    }catch(InvalidProduct e){
                        System.err.println(e);
                     } 
                    break;                 
           }
                case 2:
                {
                    System.out.println("código: ");
                    code = s.nextLine();    
                    th.remove(code);
                    int count = countries.get(Produto.getContryCode(code)); 
                    countries.put(Produto.getContryCode(code), --count);
                    break; 
                }
                case 3:
                {
                    System.out.println("código: ");
                    code = s.nextLine(); 
                    Produto p = th.cosulta(code); 
                    System.out.println(p); 
                    break;                
                }
                case 4:
