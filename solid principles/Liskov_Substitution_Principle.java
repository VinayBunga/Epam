
interface Employee_Bonus{
	public double calculateBonus(double salary);
}
interface StoreDetails{
	public void addToDatabase();
}
abstract class Employee implements Employee_Bonus,StoreDetails{
	public int employee_id;
	public String name;
	public Employee(int employee_id,String name) {
		this.employee_id=employee_id;
		this.name=name;
	}
	public abstract double calculateBonus(double salary);
	public abstract void addToDatabase();
	public String toString() {
		return "Employee ID is "+employee_id+", Name is "+name;
	}
}
class Intern extends Employee{

	public Intern(int employee_id, String name) {
		super(employee_id, name);
	}
	public double calculateBonus(double salary) {
		return salary*0.5;
	}
	public void addToDatabase() {
		System.out.println("Added Intern Details to the database");
	}
}
class Full_Time_Employee extends Employee{

	public Full_Time_Employee(int employee_id, String name) {
		super(employee_id, name);
	}
	public double calculateBonus(double salary) {
		return salary*0.75;
	}
	public void addToDatabase() {
		System.out.println("Added FTE Details to the database");
	}
}
class Contract_Employee implements StoreDetails{
	int employee_id;
	String name;
	public Contract_Employee(int employee_id, String name) {
		this.employee_id=employee_id;
		this.name=name;
	}
	public void addToDatabase() {
		System.out.println("Added Contract Employee Details to the database");
	}
	public String toString() {
		return "Employee ID is "+employee_id+", Name is "+name;
	}
}
public class Liskov_Substitution_Principle {

	public static void main(String[] args) {
		Employee intern=new Intern(1000,"Vinay");	
		System.out.println(intern);
		System.out.println(intern.calculateBonus(120000));
		intern.addToDatabase();
		
		Employee full_time_employee=new Full_Time_Employee(6000,"Kiran");	
		System.out.println(full_time_employee);
		System.out.println(full_time_employee.calculateBonus(1000000));
		full_time_employee.addToDatabase();
		
		StoreDetails contract_employee=new Contract_Employee(9001,"Avinash");	
		System.out.println(contract_employee);
		contract_employee.addToDatabase();
	}
}
