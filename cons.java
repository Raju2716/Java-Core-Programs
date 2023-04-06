/*public class cons {
    //creating a default constructor
    cons(){
        System.out.println("constructor is created");
    }
    //main method

    public static void main(String args[]){
        //calling a default constructor.
        cons c=new cons();
    }
}*/

// parameterized constructor
public class cons {
   int id;
   String name;
   //creating a parameterized constructor
   cons(int i,String n){
    id =i;
    name=n;
   }
   //method to display
   void display(){
    System.out.println(id+" "+name);
 }
 public static void main(String args[]){
    //creating objects and passings values
    cons c1=new cons(01,"Raju");
    cons c2=new cons(02,"Kaushik");
     //calling method to display values
     c1.display();
     c2.display();
 }
}
