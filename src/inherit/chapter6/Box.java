package inherit.chapter6;

public class Box {
  public Box(String s) {}
  public Box(){}
}

class ColoredBox extends Box {
  public ColoredBox(){
    super();
    System.out.println();
  }
}