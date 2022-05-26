import java.util.Scanner;

abstract class Calculation{
	abstract int doOperation(int num1,int num2);
}
class Addition extends Calculation{
	public int doOperation(int num1,int num2) {
		return num1+num2;
	}
}
class Substraction extends Calculation{
	public int doOperation(int num1,int num2) {
		return num1-num2;
	}
}
public class Open_Close_Principle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		Calculation addition=new Addition();
		System.out.println("The addition of "+num1+" and "+num2+" is "+addition.doOperation(num1, num2));
		Calculation substraction=new Substraction();
		System.out.println("The substraction of "+num1+" and "+num2+" is "+substraction.doOperation(num1, num2));
	}

}
