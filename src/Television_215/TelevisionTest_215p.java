package Television_215;

/*
   어서와 java는 처음이지! page 215p
   - 메서드의 종료, 반환값 return
*/

public class TelevisionTest_215p {
  public static void main(String[] args) {

    // instance 생성
    Television myTv = new Television();

    // instance 사용(변수 접근)
    myTv.channel = 7;
    myTv.volume = 9;
    myTv.onOff = true;

    int ch = myTv.getChannel(); // getChannel 메서드를 통해 반환된 channel 값을 int타입 변수에 저장

    // 출력
    System.out.println("현재 채널은 " + ch + "입니다.");
  }
}
