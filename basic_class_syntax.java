class stud {

    int id ;
    String name ;

     void display() {
        System.out.println(id + " " + name);
    }


    public static void main(String[] args) {
        stud s1 = new stud() ;
        stud s2 = new stud() ;
        s1.id = 101;
        s1.name = "Gaurav";
        s2.id = 102;
        s2.name = "Rahul";

        s1.display();
        s2.display();
    }


}