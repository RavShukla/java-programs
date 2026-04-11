import java.util.Scanner;
class ifelseprgrm {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no.");
    int n = sc.nextInt();
    sc.close();

    if(n % 2 == 0){
        System.out.println("even no.");
    }

    else if(n % 2 != 0){
        System.out.println("odd no.");
    }
    else {
        System.out.println("Invalid input");
    }
    }
}
