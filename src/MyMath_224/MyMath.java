package MyMath_224;

/*
   어서와 java는 처음이지! page 224p
   - 메서드 오버라이딩
*/

public class MyMath {

  // 오버라이딩: 매개변수의 타입, 개수가 다를 경우 반환값과 상관 없이 메서드 이름이 같아도 용인됨 (메서드 square)

  // 정수값을 제곱하는 메서드
  int square(int i) {
    return i * i;
  }

  // 실수값을 제곱하는 메서드
  double square(double i) {
    return i * i;
  }
}
