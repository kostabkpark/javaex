public class SwitchDemo2 {
  public static void main(String[] args) {
    String day = "화";
    String result = "";

    result = switch(day) {
      case "월","화","수","목","금"  -> "평일";
      case "토", "일"               -> "주말";
      default -> "구분할 수 없음";
    };
    System.out.println(day + ":" + result);

    int number =
     switch(day) {
      case "월","화","수","목","금"  -> 1;
      case "토", "일"               -> 2;
       default -> 0;
    };
    System.out.println(day + ":" + number);
  }
}
