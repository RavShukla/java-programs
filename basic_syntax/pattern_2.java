// *****
// *****
// *****
// *****
// *****
// pattern printing here i am printing a star pattern stated above where column are incremented as well as rows 
//as input given by user 

import java.util.Scanner;

class pattern_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.  of rows : ");
        int n = sc.nextInt();
        sc.close();

        for (int row = 1 ; row <= n; row++){
             for (int column = 1 ; column <= n; column++){
                System.out.print("* ");
             }
             System.out.println(); // Move to the next line after each row
        } 

    }

}