import java.util.Scanner;
 public class Ladder{
     
  public static void main(String args []){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter any number..!");
       int num=sc.nextInt();
      
       //using ladder if
        if(num<0){
        System.out.println("Entered number is negative");
      }
       else if(num>0){
        System.out.println("Entered number is positive");
       }
        else if(num==0){
            System.out.println("Entered number is zero");
        }
         
        else{
            System.out.println("Invalid input");
          }
    sc.close();
        
    }

 }