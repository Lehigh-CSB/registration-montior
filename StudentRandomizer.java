import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StudentRandomizer {
    private static final String[] FIRST_NAMES = { "Emma", "Liam", "Olivia", "Noah", "Ava", "William", "Sophia", "James",
            "Isabella", "Oliver", "Mia", "Benjamin", "Charlotte", "Elijah", "Amelia", "Lucas", "Harper", "Mason",
            "Evelyn", "Logan", "Abigail", "Alexander", "Emily", "Ethan", "Elizabeth" }; // Add more if needed
    private static final String[] LAST_NAMES = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller",
            "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas",
            "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris" }; // Add more if
                                                                                                     // needed
    private static final String[] MAJORS = { "Computer Science", "Mathematics", "Physics", "English", "Biology",
            "Chemistry", "History", "Psychology", "Anthropology", "Accounting", "Marketing", "Electrical Engineering",
            "Finance" }; // Add more if needed

    public static void main(String[] args) {
        String fileName = "students.csv";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.append("ID,FirstName,LastName,Major\n");

            Random random = new Random();
            for (int i = 1; i <= 999; i++) {
                String id = "S" + String.format("%04d", i);
                String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
                String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
                String major = MAJORS[random.nextInt(MAJORS.length)];

                writer.append(id + ",");
                writer.append(firstName + ",");
                writer.append(lastName + ",");
                writer.append(major + "\n");
            }

            writer.flush();
            writer.close();
            System.out.println("CSV file created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error occurred while creating CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
