import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        System.out.println("Enter three no. ");
        Scanner sc =  new Scanner(System.in);
        sc.close();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a >c){
            System.out.println("biggest no." + a);
        }

         else if (b > a && b >c){
            System.out.println("biggest no." + b);
        }

        else if(c > a && c >b){
            System.out.println("biggest no." + c);
        }

        else{
            System.out.println("no. are equal");

        }
        

    }
    
}
 