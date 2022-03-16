package practice;
import java.util.Scanner;
public class test {

	
	int marks=40;
	
	int m;
	String result;
	void add()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your marks ");
		m=s.nextInt();
			
	}
	
	void display()
	{
	result= m>marks ? "pass" : "fail" ;
	System.out.println(result);
	
	}

	public static void main(String[] args)
	{     test b1= new test();
	   b1.add ();
	   b1.display ();   //hhh
	}
         }
