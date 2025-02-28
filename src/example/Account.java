package example;

public class Account {
  private int balance;
  // 필드 추가 - 계좌번호, 계좌주
  private String accountNo;
  private String accountOwner;
  // 상수 선언- 0 , 1_000_000
  final int MIN_BALANCE = 0;
  final int MAX_BALANCE = 1_000_000;
  // 접근자(Getter)
  public int getBalance() {
    return balance;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public String getAccountOwner() {
    return accountOwner;
  }

  // 설정자(Setter) - 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
  public void setBalance(int balance) {
    if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
      this.balance = balance;
    }
  }
  // 입금 기능 추가

  // 출금 기능 추가
}