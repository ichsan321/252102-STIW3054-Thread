 public class Threadhello extends Thread {
@Override
public void run(){
   System.out.println("Hello Thread " + Thread.currentThread().getName());

}
public static void main (String[]args){
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getId());
    Threadhello helloThread1 = new Threadhello();
    Threadhello helloThread2 = new Threadhello();
    helloThread1.start();
    helloThread2.start();
}}