/*class Multi extends Thread{
    public void run(){
System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Multi t1=new Multi();
        t1.start();
    }
}*/
//  public class Multithread{

 // }
 
  class Multi implements Runnable{
    public void run(){
    System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Multi m1=new Multi();
        Thread t1 = new Thread(m1);    // Using the constructor thread(Runnable r)
        t1.start();
    }
  }
    public class Multithread{
        
    }