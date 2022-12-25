import java.util.Scanner;

public class CharacterUpperLower{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char c= s.next().charAt(0);
        if(Character.isUpperCase(c)){
            System.out.println("upper");
        } else if(Character.isLowerCase(c)) {
            System.out.println("lower");
        } else {
             System.out.println("error");
        }
    }
}