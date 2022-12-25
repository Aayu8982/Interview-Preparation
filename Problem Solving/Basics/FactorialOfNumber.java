import java.util.*;

public class FactorialOfNumber{

    static int factorial(int number){
      if(number==0 || number == 1){
        return 1;
       }
       return number * factorial(number-1);
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        while(n-->0){
            int number = s.nextInt();
            System.out.println(factorial(number));
        }
    }
}