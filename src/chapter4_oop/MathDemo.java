package chapter4_oop;

public class MathDemo {
  public static void main(String[] args) {
    //Math math = new Math();
    // 클래스 변수 - 클래스를 이용해서 객체를 생성하지 않고도 바로 사용가능
    // 메모리의 Method 영역에 Math 라는 클래스 정보를 JVM 이 읽어들일 때 저장된다.
    System.out.println(Math.PI);
  }
}
