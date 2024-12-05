// define a class that extends Thread
class MyThread extends Thread {
  public void run() {
    for (int i = 0; i<5; i++) {
      System.out.println(Thread.currentThread().getId() + "Value" + i);
      try {
          // Sleep for 500ms
          Thread.sleep(500);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
  }
} 
public class Main {
  public static void main (String[] args) {
    // Create thread objects
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    // Start the threads
    t1.start();
    t2.start();
  }
}  
