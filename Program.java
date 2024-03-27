import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Catalog catalog = new Catalog();
        User user;

        System.out.println("1: Login\n2: Sign Up");
        int input = scan.nextInt();
        scan.nextLine();
        switch (input) {
            case 1:
                System.out.println("Enter phone number to Login: ");
                String num = scan.nextLine();
                break;
            case 2:
                System.out.print("Enter Name: ");
                String name = scan.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = scan.nextLine();
                System.out.print("Enter ID: "); 
                String id = scan.nextLine();
                System.out.print("Enter email: ");
                String email = scan.nextLine();
                user = new User(name, id, email, phone);
                break;
        }

        
        System.out.print("Enter crn to search for: ");
        String choice = scan.next();
        scan.nextLine();
    
        Course foundClass = catalog.searchClass(choice);
        if(foundClass != null) {
            System.out.println("Course Found:");
            System.out.println(String.format("%-10s\t%-7s\t%-12s\t%-20s\t%-12s\t%-12s\t%-10s\t%-10s", "Course", "CRN", "Professor", "Time", "Building", "Room", "Open Seats", "Waitlisted Seats"));
            System.out.println(foundClass);
        } else {
            System.out.println("Course not found");
        }
    }

    public static void saveUser(User user) {
        File file = new File("users.txt");
        PrintWriter filWriter = new PrintWriter(file);
        
    }

    
    
}

