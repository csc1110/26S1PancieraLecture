package panciera;

public class Student extends Person {
    protected int studentID;
    protected String school;

    public Student(String name, int age, int id, String school){
        super(name,age);
        this.studentID = id;
        this.school = school;
    }

    public void screaming(){
        System.out.println("AHHHHHHHHHHH");
    }

//    public void setSchool(String school){
//        this.school = school;
//    }

    @Override
    public String toString() {
        return "panciera.Student{ " + super.toString() +
                "studentID=" + studentID +
                ", school='" + school + '\'' +
                '}';
    }
}
