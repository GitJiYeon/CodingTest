import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= T ; i++){
            String st = sc.nextLine();
            
            char first = st.charAt(0);
            char last = st.charAt(st.length() - 1);
            
            System.out.println("" + first + last);
        }
    }
}