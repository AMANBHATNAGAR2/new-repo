package practice;
import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		int a;
		String result;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your number");
		a=sc.nextInt();
		result=a>0 ? "positive" : "negative";
		System.out.println(result);
		
	}

}
