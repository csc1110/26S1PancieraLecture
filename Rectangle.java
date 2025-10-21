/**
 * Course: CSC 1110A
 * Katie Panciera
 * Oct 21, 2025
 * Week 8 Examples
 */


/**
 * Rectangle
 */
public class Rectangle {
    private int length;
    private int width;
    private int area;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int side){
        this(side, side);
    }

    public Rectangle (double side){
        this((int) side, (int) side);
    }

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
