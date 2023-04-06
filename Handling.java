public class Handling {
    public static void main(String args[]){

        try{
            int avg=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Exception is  handled");
        }
    }
}

 
  