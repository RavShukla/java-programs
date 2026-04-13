// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// pattern printing here i am printing a star pattern stated above where column are incremented 
// as row is incremented and row i srunning 2*r tijmes in first half i tis incrementing and in another half
// it is decrementing

import java.util.Scanner;   

class pattern_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows :");
        int r = sc.nextInt();
        sc.close();

        for (int row = 1 ; row <= 2*r; row++){
            if(row <= r){ 
            for (int column = 1 ; column <= row ; column++){
                System.out.print("* ");

            }
            }
            else if(row > r){
            for (int column = 2*r-row ; column >= 1 ; column--){
                System.out.print("* ");

            }
        }
            System.out.println(); 

        }

    }
}