import java.util.Scanner;
public class Calculator {
     public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the first number");
          int num1 =sc.nextInt();

          System.out.println("Enter an operator (+,-,*,/,%,>,<)");
          char op=sc.next().charAt(0);

          System.out.println("Enter the second number");
          int num2 =sc.nextInt();

          switch(op){
            case '+' : System.out.println(num1+num2);
            break;
            case '-' : System.out.println(num1-num2);
            break;
            case '*' : System.out.println(num1*num2);
            break;
            case '/' : System.out.println(num1/num2);
            break;
            case '%' : System.out.println(num1%num2);
            break;
            case '>' : if (num1>num2){
             System.out.println(num1+" is greater");
            }
             else{
                System.out.println(num2+" is greater");
            }
             break;
            case '<' : if (num1<num2){
                System.out.println(num1+" is smaller");
            }
             else{
                System.out.println(num2+" is smallerr");
             }
             break;
            default : System.out.println("Invalid Input");
            break;
          }
          
     }
}