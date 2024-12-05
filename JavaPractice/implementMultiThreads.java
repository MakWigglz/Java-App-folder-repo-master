// Consider if one has to multiply all elements by 2 and there are 500 elements in an array.
// Case 1: Java Program to illustrate Creation and execution of thread via start() and run() method in Single inheritance

// Class 1
// Helper thread Class extending main Thread Class

class MyThread1 extends Thread {
    // Method inside MyThread2
    // run() method which called as soon as thread is started
    public void run ()
  {

    // print statement when the thread is called
    System.out.println("Thread1 is running");
  }
}  

//class 2
// Main thread class extending main Thread Class
class MyThread2 extends Thread {
     // Method inside MyThread2
     // run() method which is called, as soon as thread is started
     public void run ()
     {
 // print statement when the thread is called
       System.out.println("Thread2 is running");
     }
}

// Class 3
 class MaksThrdObj {
   public static void main (String[] args)
   {
      // Creating a thread object of our thread class 
      MyThread1 obj1 = new MyThread1();
      MyThread2 obj2 = new MyThread2();

     obj1.start();
     obj2.start();
   }
 } 



    
