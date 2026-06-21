import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new
        ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            if(choice == 1){

    sc.nextLine();

    System.out.print("Enter Student Name: ");

    String name = sc.nextLine();

    students.add(name);

    System.out.println("Student Added Successfully!");

}
if(choice == 2){

    System.out.println("\nStudent List:");

    for(String student : students){

        System.out.println(student);
    }
}
if(choice == 3){

    sc.nextLine();

    System.out.print("Enter Student Name to Search: ");

    String searchName = sc.nextLine();

    if(students.contains(searchName)){

        System.out.println("Student Found!");

    } else {

        System.out.println("Student Not Found!");
    }
}

        } while(choice != 4);

        System.out.println("Program Closed!");

    }
}