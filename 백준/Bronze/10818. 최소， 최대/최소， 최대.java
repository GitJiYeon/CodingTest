import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int mini = a[0];
        int max = a[0];
        
        for(int j = 0; j < n; j++){
            if(mini > a[j]){
                mini = a[j];
            }
        }
        for(int k = 0; k < n; k++){
            if(max < a[k]){
                max = a[k];
            }
        }
            System.out.println(mini + " " + max);
    }
}