public class Course {
    // publ
    private int openSeats, waitListedSeats;
    private String abbreviation, professor, startTime, endTime, day, building, room, crn;
  
    

    public Course() {
        openSeats = 0;
        abbreviation = "";
        crn = "";
    }

    public Course(int openSeats, String crn, int waitListedSeats, String abbreviation, String professor, String startTime, 
                  String endTime, String day, String building, String room) {
        this.openSeats = openSeats;
        this.abbreviation = abbreviation;
        this.crn = crn;
        this.professor = professor;
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.building = building;
        this.room = room;
    }


        // Getter and setter methods for 'openSeats'
        public int getOpenSeats() { return openSeats; }
        public void setOpenSeats(int openSeats) { this.openSeats = openSeats; }
    
        // Getter and setter methods for 'crn'
        public String getCrn() {
            return crn;
        }
        public void setCrn(String crn) { this.crn = crn; }
    
        // Getter and setter methods for 'waitListedSeats'
        public int getWaitListedSeats() { return waitListedSeats; }
        public void setWaitListedSeats(int waitListedSeats) { this.waitListedSeats = waitListedSeats; }
    
        // Getter and setter methods for 'abbreviation'
        public String getAbbreviation() { return abbreviation; }
        public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation; }
    
        // Getter and setter methods for 'professor'
        public String getProfessor() { return professor; }
        public void setProfessor(String professor) { this.professor = professor; }
    
        // Getter and setter methods for 'startTime'
        public String getStartTime() { return startTime; }
        public void setStartTime(String startTime) { this.startTime = startTime; }
    
        // Getter and setter methods for 'endTime'
        public String getEndTime() { return endTime; }
        public void setEndTime(String endTime) { this.endTime = endTime; }
    
        // Getter and setter methods for 'day'
        public String getDay() { return day; }
        public void setDay(String day) { this.day = day; }
    
        // Getter and setter methods for 'building'
        public String getBuilding() { return building; }
        public void setBuilding(String building) { this.building = building; }
    
        // Getter and setter methods for 'room'
        public String getRoom() { return room; }
        public void setRoom(String room) { this.room = room; }
    
    public void addName(String name, int crn) { // adds name to waiting list for a course
        // add name to waiting list
    }

    public String toSaveString() {
        return String.format("%s,%-s,%s,%s,%s,%s,%s,%d,%d", abbreviation, crn, professor, day, startTime + "-" + endTime, building, room, openSeats, waitListedSeats);
    }

    public String toString() {
        return String.format("%-10s\t%-7s\t%-12s\t%-8s:%-12s\t%-12s\t%-12s\t%-10d\t%-10d", abbreviation, crn, professor, day, startTime + "-" + endTime, building, room, openSeats, waitListedSeats);
    }

    

    

    

   
}
