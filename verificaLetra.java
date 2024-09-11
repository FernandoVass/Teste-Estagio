public class verificaLetra{
    public static void main(String[] args) {

        String palavra = "Fernando Vassoler";
        char letra ='a';
        int cont = 0;
    
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == letra){
                cont ++;
            }
        }
        
        System.out.println("A letra A aparece " + cont + " vezes");
    }
   
}
