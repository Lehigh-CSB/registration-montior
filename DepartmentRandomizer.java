import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DepartmentRandomizer {
    private static final String[] DEPARTMENTS = { "Computer Science", "Mathematics", "Physics", "English", "Biology",
            "Chemistry", "History", "Psychology", "Anthropology", "Accounting", "Marketing", "Electrical Engineering",
            "Finance" }; // Add more if needed
    private static final String[] BUILDINGS = { "Drown", "Coppee", "Maginnes", "Fritz", "Mohler", "Packard", "Neville",
            "Mud", "Iacocca", "Rauch", "Business Innovation", "Zoellner" }; // Add more if needed

    public static void main(String[] args) {
        String fileName = "departments.csv";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.append("Department,Building\n");

            Random random = new Random();
            for (String department : DEPARTMENTS) {
                String building = BUILDINGS[random.nextInt(BUILDINGS.length)];

                writer.append(department + ",");
                writer.append(building + "\n");
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
