package chapter4_oop.example;

class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println(c1.radius);
    System.out.println(c1.color);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", Circle.numberOfCircles);
    // " 총 1개의 공이 만들어졌습니다."
    Circle c2 = new Circle(-5.0);
    System.out.println(c2.radius);
    System.out.println(c2.color);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", c2.numberOfCircles);
    // " 총 2개의 공이 만들어졌습니다."
    Circle c3 = new Circle("");
    System.out.println(c3.radius);
    System.out.println(c3.color);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", c3.numberOfCircles);
    // " 총 3개의 공이 만들어졌습니다."
    Circle c4 = new Circle(3.0, null);
    System.out.println(c4.radius);
    System.out.println(c4.color);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", c4.numberOfCircles);
    // " 총 4개의 공이 만들어졌습니다."
  }
}
