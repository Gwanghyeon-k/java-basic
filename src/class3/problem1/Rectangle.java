package class3.problem1;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;
    static int calculateArea(int width, int height){
        return width*height;
    }
    static int calculatePerimeter(int width, int height){
        return 2*(width+height);
    }
    static boolean isSquare(int width, int height){
        return width == height;
    }
}
