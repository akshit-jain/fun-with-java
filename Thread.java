public class Main extends Thread {
 public static void main(String[] args) {
 Main m = new Main();
 m.start();
 }
 public void run() {
 Thread t1 = new Thread(new Runnable() {
 public void run() {
 long a = 0, b = 0, c = 1;
 System.out.print("Fibonacci Series:");
 for(long i = 1; i <= 100; i++)
 {
 a = b;
 b = c;
 c = a + b;
 System.out.print(a+" "+"\n");
 }
 }
 });
 Thread t2 = new Thread(new Runnable() {
 public void run() {
 double sum = 0;
 for(double i = 1; i <= 100; i++) {
 sum = sum + (1/i);
 }
 System.out.println("Sum of reciprocal of first 100 natural
numbers is : " + sum);
 }
 });
 t1.start();
 try {
 t1.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 t2.start();
 }
}
