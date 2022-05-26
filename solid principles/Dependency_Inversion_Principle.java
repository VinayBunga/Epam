interface Calculator{
	double doOperation(int num1,int num2);
}
class Add implements Calculator{
	public double doOperation(int num1,int num2) {
		return num1+num2;
	}
}
class Substract implements Calculator{
	public double doOperation(int num1,int num2) {
		return num1-num2;
	}
}
class Multiplication implements Calculator{
	public double doOperation(int num1,int num2) {
		return num1*num2;
	}
}
class Division implements Calculator{
	public double doOperation(int num1,int num2) {
		return num1/num2;
	}
}
public class Dependency_Inversion_Principle {
	public static void main(String[] args) {
		Calculator calculation=new Add();
		int num1=10;
		int num2=20;
		System.out.println("The Addition of "+num1+" and "+num2+" is "+ calculation.doOperation(num1, num2)); 
	}
}
