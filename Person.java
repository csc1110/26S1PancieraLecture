package panciera;

public class Person {
    protected int age;
    protected String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name;
    }
}
