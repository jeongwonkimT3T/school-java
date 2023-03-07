package Car_221;

/*
   어서와 java는 처음이지! page 221
   - 자동차 클래스 작성하기
*/

public class CarTest_221 {
  public static void main(String[] args) {

    // instance 생성
    Car myCar = new Car();

    myCar.changeGear(1); // 매개변수가 있는 메서드인 changeGear()에 값 1이 전달됨
    myCar.speedUp(); // int 타입은 별도로 초기화 안 했을 경우 디폴트 값은 0이므로 +10을 했을 때 speed 값은 10이 됨

    // 출력
    System.out.println(myCar);
  }

}
