public class Fibonacci {

    
    private static int[] vetAux = new int[50];
    private static int f;

    public static long fibo(int n) {
        f = 1;
        return recursao(n);
    }

    private static long recursao(int n) {
        if(n < 0) {
            return vetAux[0];
        }else {
            if( f < 3){
                vetAux[n] = f - 1;
                f++;
            } else { 
                vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
            }
            return recursao(n - 1);
        }
    }
    public static void main(String[] args) {

        for ( int i = 0; i <= 30; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i));
        }
    }

}