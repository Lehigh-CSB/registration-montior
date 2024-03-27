import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Catalog {
    public ArrayList<Course> catalog = new ArrayList<>();

    // Constructor fills catalog with info from file
    public Catalog() {
        try {
            Scanner read = new Scanner(new File("courses.csv"));
            read.nextLine(); // removes first line with headers
            while(read.hasNextLine()) {
                String[] tokens = read.nextLine().split(",");
                String crn = tokens[0].trim();
                String abbreviation = tokens[1].trim();
                String professor = tokens[5].trim();               
                String building = tokens[6].trim();
                String room = tokens[7].trim();
                String startTime = tokens[8].trim();
                String endTime = tokens[9].trim();
                String day = tokens[10].trim();
                int openSeats = Integer.parseInt(tokens[11]);
                int waitListedSeats = Integer.parseInt(tokens[11]);
                Course c = new Course(openSeats, crn, waitListedSeats,abbreviation, professor,startTime, endTime, day, building, room);
                catalog.add(c);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
    }

    public Course searchClass(String crn) { 
        for(int i = 0; i < catalog.size(); i++) {
            if(catalog.get(i).getCrn().equals(crn)) {
                return catalog.get(i);
            }
        }
        return null;

    }

    

    //moves classes from requested list to user courses list
}
