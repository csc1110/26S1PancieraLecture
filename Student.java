public class Student extends Person {
    private int studentID;
    private String school;

    public Student(String name, int age, int id, String school){
        super(name,age);
        this.studentID = id;
        this.school = school;
    }
}
