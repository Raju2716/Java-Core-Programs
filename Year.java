import java.util.Scanner;
 public class Year{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter any year..!");

         int year =sc.nextInt();
         for(int i=1947; i<=2024;i++){}
         if(year%4==0 && year%100!=00 || year%400==0){
            System.out.println("Entered year is leap year");
         }
          else{
            System.out.println("Entered year is not leap year");
          }
        sc.close();
    }
 }