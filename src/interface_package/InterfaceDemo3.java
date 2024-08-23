package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    Controllable.reset();
    System.out.println(tv.CNT);

    
  }
}
