package objectpackage;

public class Person {
  private int age;
  private String name;
  private String nat;
  private String address;

  public String getNat() {
    return nat;
  }

  public void setNat(String nat) {
    if(nat == null || nat.equals("") || nat.equals(" ")) {
      this.nat = "대한민국";
    } else {
      this.nat = nat;
    }
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    if(address == null || address.equals("") || address.equals(" ")) {
      this.address = "서울";
    } else {
      this.address = address;
    }
  }

  public int getAge() {
    return age;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age){
    if(age < 0 || age > 130) { // 129살이 가장 많은 나이라고 가정
      System.out.println("나이는 0에서 129 살까지만 입력가능합니다.");
    } else {
      this.age = age;
    }
  }
  public void setName(String name){
    if(name == null || name.equals("") || name.equals(" ")) {
      name = "홍길동";
    } else {
      this.name = name;
    }
  }

  public void sayHello() {
    System.out.printf("국적은 %s 이고, 주소는 %s 이고, 이름은 %s 이고, 나이는 %d 입니다.\n",
        nat, address, name, age);
  }
}
