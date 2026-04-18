import java.util.Scanner;

class Studinp {

    int id;
    String name;

    void getData(Scanner sc) {
        System.out.print("Enter id: ");
        id = sc.nextInt();

        System.out.print("Enter name: ");
        name = sc.next();
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Studinp s[] = new Studinp[n];

        for(int i = 0; i < s.length; i++) {
            s[i] = new Studinp();
            s[i].getData(sc);
        }

        System.out.println("\nStudent Data:");

        for(int i = 0; i < s.length; i++) {
            s[i].display();
        }

        sc.close();
    }
}