import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int add = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            add += a[i];
        }
        Arrays.sort(a);
        System.out.println(add/5);
        System.out.println(a[2]);
        
        
    }
}