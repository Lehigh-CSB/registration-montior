import java.util.ArrayList;
public class User {
    private String name, id, phoneNum, email;
    private ArrayList<Course> requestedCourses; //courses the user has requested

    public User() {
        name = "";
        id = "";
        phoneNum = "";
        email = "";
        requestedCourses = null;
    }

    public User(String name, String id, String email, String phoneNum) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNum = phoneNum;
        requestedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String n) {
        name = n;
    }

    public void setID(String i) {
        id = i;
    }

    public void setPhoneNum(String p) {
        phoneNum = p;
    }

    public void setEmail(String e) {
        email = e;
    }

    public ArrayList<Course> getCourses() {
        return requestedCourses;
    }

    public void requestCourse(Course c) {
        requestedCourses.add(c);
    }


    

}
