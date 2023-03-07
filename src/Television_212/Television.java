package Television_212;

/*
   어서와 java는 처음이지! page 212
   - Television 클래스에 메서드 추가하기   
*/

public class Television {

  // 멤버 변수 선언
  int channel; // 채널 번호
  int volume; // 볼륨
  boolean onOff; // 전원 상태

  // 메서드 정의
  void print() {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  int getChannel() { // get: 값을 반환
    return channel;
  }

  void setChannel(int ch) { // set: 값을 할당
    channel = ch;
  }
}
