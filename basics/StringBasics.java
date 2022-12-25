import java.util.*;

class StringBasics{
	public static void main(String[] args){
		String s1= "Aayush Sharma";
		System.out.println(s1);

		char[] s2= "SUbhash Sharma".toCharArray();
		System.out.println(s2);
		System.out.println(String.valueOf(s2));

		Scanner sc=new Scanner(System.in);
		String name = sc.nextLine();
		char[] ch = name.toCharArray();
		System.out.println(name);

		for(int i=0;i<name.length();i++){
			ch[i]='J';
		}

		System.out.println(ch);
	}
}