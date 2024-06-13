import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        
        for(int i = 0; i < 9; i++){
            a[i] = sc.nextInt();
        }
        int m = a[0];
        int n = 0;
        for(int i = 1; i < 9; i++) {
            if(a[i] > m) {
                m = a[i];
                n = i;
            }
        }
        System.out.println(m);
        System.out.println(n + 1);
    }
}
