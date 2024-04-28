import java.util.Scanner;
    public class Main{
        public static void main( String arg[] ){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for(int M = 1; M < 10 ; M++)
                System.out.println(N + " * " + M + " = " + N*M);
        }
    }