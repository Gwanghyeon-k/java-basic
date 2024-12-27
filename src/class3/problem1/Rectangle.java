package class3.problem1;

public class Rectangle {
    int width;
    int height;
    // 사각형 객체에 이런 인자들은 필요가 없음
//    int area;
//    int perimeter;
//    boolean square;
    int calculateArea(){
        return width*height;
    }
    int calculatePerimeter(){
        return 2*(width+height);
    }
    boolean isSquare(){
        return width == height;
    }
    // static을 사용하지 않게 해서 객체를 호출하지 않아도 사용할 수 있게끔 수정하고
    // return width -> 결국 return this.width에서 this가 생략된 형태임
    // width와 height가 객체 안에 속하는 인자이기 때문에 따로 전달해주지 않아도 됨 만약 다른 area 같은 것을 필요로 한다면 전달해줘야됨
}
