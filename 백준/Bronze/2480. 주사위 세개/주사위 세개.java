import java.util.Scanner;
    public class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int h = 0;
            
            if(a == b && b == c){
                h = 10000 + (a*1000);
            }
            else if(a == b || a == c){
                h = 1000 + (a*100);
            }else if(b == c){
                h = 1000 + (b*100);
            }
            else{
                int m = a;
                
                if(b > m){
                    m = b;
                }
                if(c > m){
                    m = c;
                }
                h = m*100;
            }
           
                System.out.print(h);
                
        }
    }