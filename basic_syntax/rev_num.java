import java.util.Scanner;

public class rev_num {
 public static void main(String[] args) {
     System.out.println("Enter a no. for reversing :");
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int rev = 0;
        for(int i = 1 ; i<= n ; i++){
            int remainder = n%10;
            n = n/10;
            rev = rev*10 + remainder;
        

        }
        System.out.println("reverse of " + n + "is " + rev);
 }
    
}

