import java.util.Scanner;
    public class Main{
        public static void main( String args[] ){
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int C = sc.nextInt();
            
            int T = ( A * 60 ) + B;
            T = T + C;
            int H = (T/60);
            int M = (T%60);
            if( H > 23 ){
                H = H%24;
            }
                System.out.print(H + " " + M);
        }
    }