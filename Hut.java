import java.util.Scanner;
class Hut{
public static void main(String args[]){
System.out.print("Enter your name..?");
Scanner sc = new  Scanner (System.in);
String name=sc.next();
System.out.println("Enter your age..?");
int age=sc.nextInt();
System.out.println(name);
System.out.println(age);
sc.close();
  }
}