import java.util.Scanner;
class Transaction {
    int balance = 10000;
    void withdraw(int amount){
        
        if(balance < amount){
            System.out.println("insufficient balance");
        }
        else{
            balance = balance - amount ;
            System.out.println("Transaction succesfull your balance is :" + balance);

        }
        
    }
    void deposit(int amount){
         
        
        balance=balance+amount;
        System.out.println("Transaction succesfull your balance is :" + balance);
    }
    
    public static void main(String[] args) {
        System.out.println("for deposit choose 1 and for withdraw choose 2");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c!=1 && c!=2){
            System.out.println("invalid input");
            sc.close();
            return;
        }

        System.out.println("enter amount ");
        int amount = sc.nextInt();
        sc.close();


        if(c==1){
            System.out.println("enter amount you want to deposit ");
            Transaction t = new Transaction();
            t.deposit(amount);
        }
        else if(c==2){
            System.out.println("enter amount you want to withdraw");

            Transaction t = new Transaction();
            t.withdraw(amount);
        }
        else{
            System.out.println("error occured");
        }
    }
}
