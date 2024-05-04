import java.util.Scanner;
    public class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int q = sc.nextInt();
            int l = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            int K = 1-k;
            int Q = 1-q;
            int L = 2-l;
            int B = 2-b;
            int N = 2-n;
            int P = 8-p;
            
            System.out.println(K+" "+Q+" "+L+" "+B+" "+N+" "+P);
        }
    }