import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ProfessorRandomizer {
    private static final String[] FIRST_NAMES = { "John", "Jane", "Michael", "Emily", "David", "Sarah", "Daniel",
            "Jennifer",
            "Robert", "Jessica", "Christopher", "Melissa", "James", "Laura", "Matthew", "Amanda", "William", "Nicole",
            "Joseph", "Elizabeth", "Andrew", "Stephanie", "Brian", "Lauren", "Jason" }; // Add more if needed
    private static final String[] LAST_NAMES = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller",
            "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas",
            "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris" }; // Add more if
                                                                                                     // needed
    private static final String[] DEPARTMENTS = { "Computer Science", "Mathematics", "Physics", "English", "Biology",
            "Chemistry", "History", "Psychology", "Anthropology", "Accounting", "Marketing", "Electrical Engineering",
            "Finance" }; // Add more if needed

    public static void main(String[] args) {
        String fileName = "professors.csv";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.append("ID,FirstName,LastName,Department\n");

            Random random = new Random();
            for (int i = 1; i <= 50; i++) { // Assuming 50 professors
                String id = "P" + String.format("%03d", i); // Generating IDs like P001, P002, ...
                String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
                String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
                String department = DEPARTMENTS[random.nextInt(DEPARTMENTS.length)];

                writer.append(id + ",");
                writer.append(firstName + ",");
                writer.append(lastName + ",");
                writer.append(department + "\n");
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
