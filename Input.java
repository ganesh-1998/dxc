import java.util.Scanner;
public class Input {
	Scanner sc=new Scanner(System.in);
	int age=0;
	String name;
	public void output()
	{
		System.out.print("age is:");
		age=sc.nextInt();
		System.out.print("name is:");
		name=sc.next();
		System.out.println(name+"age is:"+age);
	}
	public static void main(String args[])
	{
		Input i=new Input();
		i.output();
	}

}
