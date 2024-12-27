package class3.problem1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.area = rectangle.calculateArea(rectangle.width, rectangle.height);
        rectangle.perimeter = rectangle.calculatePerimeter(rectangle.width, rectangle.height);

        rectangle.square = rectangle.isSquare(rectangle.width, rectangle.height);

        System.out.println("넓이: " + rectangle.area);
        System.out.println("둘레 길이: " + rectangle.perimeter);
        System.out.println("정사각형 여부: " + rectangle.square);
    }
}
