import java.util.Scanner;
public class Add {
	Scanner sc=new Scanner(System.in);
	int num1=0;
	int num2=0;
	int result=0;
	public void addnumbers()
	{
		System.out.print("enter first number:");
		num1=sc.nextInt();
		System.out.print("enter second number:");
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println("Result is: "+num1+"+"+num2+" ="+result);
	}
	public static void main(String args[])
	{
		Add a=new Add();
		a.addnumbers();
	}
}


