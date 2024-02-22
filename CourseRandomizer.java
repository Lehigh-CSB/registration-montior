import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CourseRandomizer {
    private static final String[] SUBJECTS = { "CSE", "MATH", "PHYS", "ENGL", "BIO", "CHEM", "HIST", "PSYCH", "ANTHR",
            "ACCT", "MKT", "ECE", "FIN" }; // Add more if needed
    private static final String[] DAYS_OF_WEEK = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
    private static final String[] BUILDINGS = { "Drown", "Coppee", "Maginnes", "Fritz", "Mohler", "Packard", "Neville",
            "Mud", "Iacocca", "Rauch", "Business Innovation", "Zoellner" }; // Add more if needed
    private static final String[] PROFESSORS = { "Dr. Smith", "Dr. Johnson", "Dr. Williams", "Dr. Brown", "Dr. Davis" }; // Add
                                                                                                                         // more
                                                                                                                         // if
                                                                                                                         // needed

    public static void main(String[] args) {
        String fileName = "courses.csv";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.append(
                    "CRN,Abbreviation,Name,Section,Prereq,Professor,Building,Room,StartTime,EndTime,Day,Seats,WaitlistedSeats\n");

            Random random = new Random();
            for (int i = 1; i <= 99999; i++) {
                String crn = String.format("%05d", i);
                String abbreviation = SUBJECTS[random.nextInt(SUBJECTS.length)] + "-"
                        + String.format("%03d", random.nextInt(1000));
                String name = "Course " + i;
                String section = "010";
                String prereq = SUBJECTS[random.nextInt(SUBJECTS.length)] + "-"
                        + String.format("%03d", random.nextInt(1000));
                String professor = PROFESSORS[random.nextInt(PROFESSORS.length)];
                String building = BUILDINGS[random.nextInt(BUILDINGS.length)];
                String room = "Room " + (random.nextInt(100) + 100);
                int startTime = random.nextInt(12) + 8;
                int endTime = startTime + 1;
                String day = DAYS_OF_WEEK[random.nextInt(DAYS_OF_WEEK.length)];
                int seats = random.nextInt(30) + 10;
                int waitlistedSeats = random.nextInt(21);

                writer.append(crn + ",");
                writer.append(abbreviation + ",");
                writer.append(name + ",");
                writer.append(section + ",");
                writer.append(prereq + ",");
                writer.append(professor + ",");
                writer.append(building + ",");
                writer.append(room + ",");
                writer.append(startTime + ":00,");
                writer.append(endTime + ":15,");
                writer.append(day + ",");
                writer.append(seats + ",");
                writer.append(waitlistedSeats + "\n");
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
