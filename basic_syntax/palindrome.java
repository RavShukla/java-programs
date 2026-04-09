import java.util.Scanner;

public class palindrome {
 public static void main(String[] args) {
     System.out.println("Enter a no. for palindrome check :");
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int chk = n;
        int rev = 0;
        while (n>0){
            int reaminder = n%10;
            n = n/10;
            rev = rev*10 + reaminder;
        

        }
        if (rev == chk){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
       
 }
    
}

