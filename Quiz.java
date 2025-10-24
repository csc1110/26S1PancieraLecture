public class Quiz {
    private String course;
    private String gradeItem;
    private int pointsPossible;
    private int pointsEarned;
    private double percentage;

    public Quiz(){
       this("CSC0001", "Quiz", 10);
    }

    public Quiz(String course, String gradeItem){
        this(course, gradeItem, 10);
    }

    public Quiz(String course, String gradeItem, int pointsPossible){
        this.course = course;
        this.gradeItem = gradeItem;
        this.pointsPossible = pointsPossible;
        this.pointsEarned = pointsPossible;
        calculatePercentage();
    }

    public void setPointsPossible(int pointsPossible){
        this.pointsPossible = pointsPossible;
    }

    public void setPointsEarned(int pointsEarned){
        this.pointsEarned = pointsEarned;
    }

    public void calculatePercentage(){
        this.percentage = (double) this.pointsEarned/this.pointsPossible;
    }

    public void display(){
        System.out.println(course + " " + gradeItem + " " +
                pointsEarned + "/" + pointsPossible + " " +
                percentage + "%");
        System.out.print("Hello");
        System.out.printf("Course %s %s %d/%d %.1f%n",course, gradeItem,
                pointsEarned,pointsPossible,percentage);
        // %s String
        // %d integers
        // %f floating point
        // %.2f floating point with 2 digits after decimal
        // %n new line
    }
}










