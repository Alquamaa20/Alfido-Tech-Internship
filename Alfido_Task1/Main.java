class Student {
    String name;
    void display() {
        System.out.println(name);
    }
}
public class Main {
       public static void main(String[]args) {
        Student s1= new Student();
        s1.name = "Ramsha";
        s1.display();
    }
}