import java.util.Scanner;
    public class Main{
        public static void main ( String args[] ){
            Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
                if ( A % 4 == 0 && A % 100 != 0)
                    System.out.print("1");
                else if (A % 400 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }               
    }