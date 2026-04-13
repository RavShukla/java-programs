//    *
//   * *
//  * * *
// * * * *
//* * * * * 
// * * * *
//  * * *
//   * *
//    *
// 
// pattern printing here i am printing a star pattern stated above where column are incremented 
// as row is incremented and row i srunning 2*r tijmes in first half i tis incrementing and in another half
// it is decrementing

import java.util.Scanner;   

class pattern_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter max no. of rows :");
        int n = sc.nextInt();
        sc.close();

        for (int row = 1 ; row <= 2*n; row++){
            for (int wtspaces = 1 ; wtspaces <= n-row ; wtspaces++){
                    System.out.print("_");
                }
            if(row <= n){ 
            for (int column = 1 ; column <= row ; column++){
                
                
                
                System.out.print("* ");

            }
            }
            
            else if(row > n){
                for (int wtspaces = 1 ; wtspaces <= row-n; wtspaces++){
                    System.out.print("_");
                }
            for (int column = 2*n-row ; column >= 1 ; column--){
                System.out.print("* ");

            }
        }
            System.out.println(); 

        }

    }
}

