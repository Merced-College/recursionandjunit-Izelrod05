/*Izel Rodriguez Diaz
07/17/2025
recursion and junit assigment
*/
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }   

    public static int count8(int n){
        if(n == 0){
            return 0;
        }
         int lastDigit = n%10;
         int nextDigit =(n/10)%10;

        if(lastDigit == 8){
             if (nextDigit == 8) {
                 return 2 + count8(n / 10);
             } else {
                return 1 + count8(n / 10);
             }
         } else {
         return count8(n / 10);
        }
        
    }  

    public static int countHi(String str){
        // hi cannot be less than 2 letters long
        if(str.length() < 2){
            return 0;
        }
        // checks if first to letter combine to maek hi
        if (str.substring(0,2).equals("hi")){
            return 1+ countHi(str.substring(1));

        }else{
            return countHi(str.substring(1));
        }
    }

    public static int countHi2(String str){
        // hi cannot be less than 2 letters long
        if(str.length() < 2){
            return 0;
        }
        
        if (str.length()>= 3 && str.substring(0,3).equals("xhi")){
            return  countHi2(str.substring(3));

        }else if (str.substring(0, 2).equals("hi")){
            return 1 + countHi2(str.substring(2));
        }else{
            return countHi2(str.substring(1));
        }
    }

    public static int strCount(String str,String sub){
        if(str.length() < sub.length()){
            return 0;
        }//Used copilot to help with this 
        if(str.substring(0,sub.length()).equals(sub)){
            return 1 + strCount(str.substring(sub.length()), sub);
        }else{
            return strCount(str.substring(1), sub);
        }

   }

   //public static String stringClean(String str);




}