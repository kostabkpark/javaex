package advancedJava2;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
    //thread.run();
    long before = System.currentTimeMillis();
    for (int i = 0; i < 5; i++) {
      System.out.println("메인입니다.");
      Thread.sleep(500);
    }
    long after1 = System.currentTimeMillis();
    System.out.println(after1 - before);


    long after = System.currentTimeMillis();
    System.out.println(after - after1);
  }
}

//class MyThread extends Thread {
//  @Override
//  public void run() {
//    System.out.println("Mythread");
//  }
//}

class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("안녕!");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}