import java.util.Scanner;
class Dj{
public static void main(String args[]){
 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number");
int a=sc.nextInt();
System.out.println("Enter the sec number");
int b=sc.nextInt();
        
       int division = a/b;
 System.out.println(division);
sc.close();
  }
}