import java.util.Scanner;
class A{
    public static void main(String args[]){

        int a[]=new int [5]; int max;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Any Element");
        for(int i=0; i<5; i++){

            a[i]=r.nextInt();
        }
          max=a[0];
          for(int i=1; i<5; i++){
       if(a[i]>max){
        max=a[i];
       }
          }
          System.out.print("Maximum Element "+max);
    }

}