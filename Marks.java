import java.util.Scanner;
 public class Marks{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a marks..!");
        int marks=sc.nextInt();

        // using ladder if
        
        if(marks < 50){
            System.out.println("Fail");
        }
         else if(marks>50&&marks<60){
            System.out.println("D");
         }
          else if(marks>60&&marks<75){
            System.out.println("C");
          }
           else if(marks>75&&marks<80){
            System.out.println("B");
         }
          else if(marks>80&&marks<100){
            System.out.println("A");
        }
         else{
               System.out.println("Invalid input");
         }
           sc.close();
    }
 }

 