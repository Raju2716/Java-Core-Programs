public class Char {
    public static void main(String args[]){
        String word = "Raju";
        int count = 0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}