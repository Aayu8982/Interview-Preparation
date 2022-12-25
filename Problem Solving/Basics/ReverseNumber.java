import java.lang.*;
import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T= s.nextInt();
        while(T>0){
            int number = s.nextInt();
            int reverse=0;
            while(number>0){
                int rem = number%10;
                reverse = (reverse * 10) + rem;
                number=number/10;
            }
            System.out.println(reverse);
            T--;
        }
    }
}