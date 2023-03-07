package Car_221;

/*
   어서와 java는 처음이지! page 221
   - 자동차 클래스 작성하기
*/

public class Car {
  // 멤버 변수 선언
  String color; // 색상
  int speed; // 속도
  int gear; // 기어

  // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
  // toString: 객체를 문자열로 표현하는 메서드
  @Override
  public String toString() {
    return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
  }

  // 메서드 정의
  void changeGear(int g) {
    gear = g;
  }

  void speedUp() {
    speed = speed + 10;
  }

  void speedDown() {
    speed = speed - 10;
  }
}
