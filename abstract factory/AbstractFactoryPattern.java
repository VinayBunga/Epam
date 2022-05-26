package AbstractFactoryDesignPattern;
import java.util.Scanner;
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		FactoryProducer factoryproducer =new FactoryProducer();
		System.out.println("Do you want Eamcet or Ecet details");
		Scanner sc=new Scanner(System.in);
		String factory=sc.next();
		if(factory.equalsIgnoreCase("eamcet")){
			AbstractFactory abstractfactory=new Eamcet_Students();
			System.out.println("Enter branch name");
			String branch=sc.next();
			Branches b=abstractfactory.getBranchName(branch);
			b.No_of_Students();
		}
		else if(factory.equalsIgnoreCase("ecet")) {
			AbstractFactory abstractfactory=new Ecet_Students();
			System.out.println("Enter branch name");
			String branch=sc.next();
			Branches b=abstractfactory.getBranchName(branch);
			b.No_of_Students();

		}
		else
			System.out.println("Wrong factory entered!!");
	}
}
