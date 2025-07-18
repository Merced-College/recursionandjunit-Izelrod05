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
                 return 2 + count8(n / 10); // Double count and skip only one digit to catch overlapping 8s
             } else {
                return 1 + count8(n / 10);
             }
         } else {
         return count8(n / 10);
        }
        
    }  
}