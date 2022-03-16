package practice;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number 1");
		a =sc.nextInt();
        System.out.println("enter your number2");
		b= sc.nextInt();
		if (a>b)
		{ System.out.println("a is greater number ");
		}
		else
		{ 
			System.out.println("b is greater number");
		}
	}

}
