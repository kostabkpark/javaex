package objectpackage;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(10);
    person.setName("김민국");
    person.setNat("대한민국");
    person.setAddress("경기도");
    person.sayHello();

    Person person2 = new Person();
    person2.setAge(20);
    person2.setName("홍길동");
    person2.setNat("");
    person2.setAddress("");
    person2.sayHello();
  }
}
