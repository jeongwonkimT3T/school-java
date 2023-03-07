package Television_212;

/*
   어서와 java는 처음이지! page 212
   - Television 클래스에 메서드 추가하기   
*/

public class TelevisionTest_212p {
  public static void main(String[] args) {

    // instance 생성
    Television myTv = new Television();

    // instance 사용(변수 접근)
    myTv.channel = 7;
    myTv.volume = 9;
    myTv.onOff = true;

    // 메서드 호출 → 참조변수.메서드이름(); or 참조변수.메서드이름(값1, 값2, ...)
    myTv.print();

    Television yourTv = new Television();
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.onOff = true;
    yourTv.print();

  }
}
