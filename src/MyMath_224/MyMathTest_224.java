package MyMath_224;

public class MyMathTest_224 {
  public static void main(String[] args) {

    // instance 생성
    MyMath obj = new MyMath();

    // 인수가 int타입이므로 int square() 메서드에 값 10이 전달됨
    System.out.println(obj.square(10));

    // 인수가 double타입이므로 double square() 메서드에 값 3.14가 전달됨
    System.out.println(obj.square(3.14));
  }
}
