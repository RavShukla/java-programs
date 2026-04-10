import java.util.Scanner;

public class factorial_loops {
 public static void main(String[] args) {
     System.out.println("Enter a no. for factorial :");
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i = 1 ; i<= n ; i++){
            fact = fact * i ;
        
        }
        System.out.println("factorial of " + n + "is " + fact);
 }
    
}
