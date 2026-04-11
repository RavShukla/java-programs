// *
// **
// ***
// ****
// *****
// pattern printing here i am printing a star pattern stated above where column are incremented 
// as row is incremented

import java.util.Scanner;   

class pattern_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows :");
        int r = sc.nextInt();
        sc.close();

        for (int row = 1 ; row <= r; row++){
            for (int column = 1 ; column <= row ; column++){
                System.out.print("* ");

            }
            System.out.println(); 

        }

    }
}