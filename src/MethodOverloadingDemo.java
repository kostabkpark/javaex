public class MethodOverloadingDemo {
  public static void main(String[] args) {
//    add2Numbers(1, 2);
//    add3Numbers(1,2,3);
//    add4Numbers(1,2,3,4);
    addNumbers(1,2);
    addNumbers(1000L,2000L);
    addNumbers(1.0, 2.0);
  }

  private static void addNumbers(int... numbers){
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    System.out.println(result);
  }

  private static void addNumbers(long... numbers){
    long result = 0;
    for (long number : numbers) {
      result += number;
    }
    System.out.println(result);
  }

  private static void addNumbers(double... numbers){
    double result = 0.0;
    for (double number : numbers) {
      result += number;
    }
    System.out.println(result);
  }
}
