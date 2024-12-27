package class3.problem1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        // 직접 인자를 넣어주지 않아도 됨
        //인스턴스 메서드에서는 필드(멤버 변수) 자체에 접근할 수 있으므로 인자를 전달할 필요가 없음
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();

        boolean square = rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}
