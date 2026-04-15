import java.util.Scanner;

class area_rectangle {
    int length;
    int breadth;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        length = sc.nextInt();
        System.out.println("Enter breadth :");
        breadth = sc.nextInt();
        sc.close();

    }
    int rectangle(){
        return length * breadth;
    }
    public static void main(String[] args) {
        area_rectangle a = new area_rectangle();
        a.getData();
        System.out.println("Area of rectangle is: " + a.rectangle());
    }
    
}
