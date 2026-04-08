import java.util.Scanner;

public class input_string {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println(name);
        sc.close();
    }
}
