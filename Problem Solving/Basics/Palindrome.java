import java.util.*;

public class Palindrome{
    
    static String checkPalindrome(int number){
        int temp=number;
        int reverse=0;
        while(temp>0){
            reverse=(reverse*10)+temp%10;
            temp/=10;
        }
        return reverse == number ? "Yes" : "No";
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T= s.nextInt();
        while(T-->0){
            int number = s.nextInt();
            System.out.println(checkPalindrome(number));
        }
    }
}