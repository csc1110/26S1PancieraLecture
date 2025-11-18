package panciera;

public class StudentDriver {
    public static void main(String[] args){
        CollegeStudent chris = new CollegeStudent("biz", 4.0);

        System.out.println(chris.toString());

        chris.setSchoolandMajor("uwm", "english");

        System.out.println(chris.toString());

        Student chris2 = new CollegeStudent("hype", 0.0);
        Person chris3 = new CollegeStudent("stuff", -1.0);
        Object chris4 = new CollegeStudent("grocery shopping", 5.7);

        System.out.println(chris2.toString());
        System.out.println(chris3.toString());
        System.out.println(chris4.toString());

        chris2.screaming();
        chris.screaming();
        ((Student) chris3).screaming();
        ((CollegeStudent) chris2).setSchoolandMajor();
        ((Student) chris3).screaming();
        chris3.screaming();

        Student chris5 = (Student) chris3;

        int var = 3;
        (double) var;

    }
}
