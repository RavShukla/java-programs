import java.util.Scanner;

class function_input {
    static void sum(int a , int b ){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter two numbers to find their sum: ");
         a = sc.nextInt();
         b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + (a+b));
        sc.close();
    }

    static void factorial(int n){
       
        int fact = 1;        for(int i = 1 ; i <=n ; i++){
            fact = fact * i ;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
       
    }

    

    static int fibonacci(int n){

        if(n <= 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }


     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci = " + fibonacci(n));

        sc.close();
    }
}
