package panciera;

public class CollegeStudent extends Student{
    private String major;
    private double gpa;

    public CollegeStudent(String major, double gpa) {
        super("chris", 14, 1237, "msoe");
        this.major = major;
        this.gpa = gpa;
    }

    public CollegeStudent(String name, int age, int id, String school, String major, double gpa){
        super(name, age, id, school);
        this.major = major;
        this.gpa = gpa;
    }

    public void setSchoolandMajor(String school, String major){
        this.major = major;
        this.school = school;
    }

    @Override
    public String toString() {
        return "panciera.CollegeStudent{" + super.toString() +
                "major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
