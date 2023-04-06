/*public class Abstraction {
    //main method
    public static void main(String args[]){
        Shape s= new Circle();     //object creation
        s.draw();
    }
}
  //abstract class having abstract method
    abstract class Shape{
        abstract void draw();
    }
    // subclass
    class Rectangle extends Shape{
        void draw(){
            System.out.println("drwaing rectangle");
        }
    }
    //subclass
    class Circle extends Shape{
        //abstract method with implementation.
        void draw(){
            System.out.println("drwaing circle"); 
        }
    }*/

   public class Abstraction {
   //main method
   public static void main(String args[]){
    Honda h =new Honda();
    h.run();
   }
   } 
   class Bike{
       final void run(){                   //final method with cannot be o
            System.out.println("Running");
        }
   }
    class  Honda extends Bike{
        void fast(){
            System.out.println("Running safely..!");
        }
    }