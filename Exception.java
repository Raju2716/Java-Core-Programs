public class Exception {
    public static void main(String args[]){
        //calling the validate func
  validate(21);

 }
 public static void validate(int age){
     if(age<18){
        //throwing an exception
        throw new ArithmeticException("Person is not eligible to vote");
     }else{
        System.out.println("person is  eligible to vote");
     }
     //main method
 }
}