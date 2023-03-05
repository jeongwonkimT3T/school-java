/*
   어서와 java는 처음이지! page 209 ~ 210
   - 객체 생성과 사용 예제 (Box 클래스 작성)    
*/

class Box {
  // 멤버 변수 선언
  int width;      // 상자의 가로
  int length;     // 상자의 세로
  int height;     // 상자의 높이
}

public class Box_209p {
  public static void main(String[] args) {
    
    /* 
    instance 생성 방법
    1. 클래스명 참조변수명
    2. 참조변수명 = new 클래스명();    // 간략화 → 클래스명 참조변수명 = new 클래스명()
     */

    // instance 생성
    Box b;
    b = new Box(); 

    // instance 사용(변수 접근)       // 접근 방법 → 참조변수.멤버변수
    b.width = 20;
    b.length = 20;
    b.height = 30;

    // 출력
    System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");

  }
}
