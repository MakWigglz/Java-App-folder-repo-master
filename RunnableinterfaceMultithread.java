// Using Runnable Interface
// Another way to achieve multithreading in java is via the Runnable interface. Runnable interface being a functional interface has its own run() method. 
// Here classes are implemented to the Runnable interface. 
// Later on, in the main() method, Runnable reference is created for the classes that are implemented in order to make bondage with Thread class to run our own corresponding run() methods.
// Further, while creating an object of Thread class we will pass these references in Thread class as its constructor allows only one runnable object, which is passed as a parameter while creating Thread class object in a main() method. Now lastly just like what we did in Thread class, start() method is invoked over the runnable object who are now already linked with Thread class objects, so the execution begins for our run() methods in case of Runnable interface. It is shown in the program below as follows:


// Java Program to illustrate Runnable Interface in Threads as multiple inheritance is not allowed.
// Importing basic packages
import java.io.*;
import java.util.*;

// Class 1
// Helper class implementing Runnable interface
class MyThread1 implements Runnable {
     // run () method inside this class
     public void run()
     { 

     // Iterating to get more execution of threads
       for (int i = 0; i<5; i++) {
     // Print statement whenever run() method of this class is called
        System.out.println("Thread1");

     // Getting sleep method in try block to check for any exceptions
         try {
              // Making the thread pause for a certain time using the sleep() method
              Thread.sleep(1000);
         }
         // Catch block to handle the exceptions
           catch (Exception e) {
           }
       }   
     }
}
// Class 2: Helper class implementing Runnable interface
class MyThread2 implements Runnable {
    // run() method inside this class
    public void run ()
    {
        for (int i = 0; i < 5; i++) {
        


            // Print statement whenever run() method
            // of this class is called
            System.out.println("Thread2");

            // Getting sleep method in try block to
            // check for any exceptions
            try {

                // Making the thread pause for a certain
                // time
                // using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}

// Class 3
// Main class
public class MaksThrdObj {
   //Main driver method
   public static void main(String[] args)
  {

    //Creating reference of Runnable to our classes above in main() method
    Runnable obj1 = new MyThread1();
    Runnable obj2 = new MyThread2();

    // Creating of thread class by passing object of Runnable in constructor of Thread class
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    
       // Starting the execution of our own run() method in the classes above
       t1.start();
       t2.start();
  }
}  

// Output:
// Thread2
// Thread1
// Thread2
// Thread1
// Thread2
// Thread1
// Thread2
// Thread1
// Thread2
// Thread1

/* Points to remember: Whenever you wanted to create threads, there are only two ways:

Extending the class
Implementing the interface which is runnable
Make sure to create an object of threads in which you have to pass the object of runnable

Special Methods of Threads
Now let us discuss various methods that are there for threads. Here we will be discussing major methods in order to have a practical understanding of threads and multithreading which are sequential as follows:

start() Method
suspend() Method
stop() Method
wait() Method
notify() Method
notifyAll() Method
sleep() Method
Output Without sleep() Method
Output with sleep() method in Serial Execution Processes (Blocking methods approach)
Output with sleep() method in Parallel Execution Processes (Unblocking methods approach)
join() Method  */
