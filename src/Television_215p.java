/*
   어서와 java는 처음이지! page 215p
   - 메서드의 종료, 반환값 return
*/

class Television {

  // 멤버 변수 선언
  int channel;    // 채널 번호
  int volume;     // 볼륨
  boolean onOff;  // 전원 상태

  // 메서드 선언
  void print() { // 정보 출력
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  int getChannel() { // channel 값 반환
    return channel;
  }

  /*
   return: 메서드를 종료시키거나, 특정 값을 반환할 때 사용
   */

  
}

public class Television_215p {
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
