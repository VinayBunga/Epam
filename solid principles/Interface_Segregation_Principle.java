interface BurgerOrderService{
	void orderBurger(int burger_quantity);
}
interface FriesOrderService{
	void orderFries(int fries_quantity);
}
interface payForOrder{
	double calculateTotalAmount(int burger_quantity,int fries_quantity);
}
class Customer implements BurgerOrderService, FriesOrderService,payForOrder{
	public void orderBurger(int burger_quantity) {
		System.out.println("Received an order for "+burger_quantity+" burgers");
	}
	public void orderFries(int fries_quantity) {
		System.out.println("Received an order for "+fries_quantity+" burgers");
	}
	public double calculateTotalAmount(int burger_quantity,int fries_quantity) {
		double amount=burger_quantity*150+fries_quantity*100;
		return amount;
	}
}
public class Interface_Segregation_Principle {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.orderBurger(2);
		customer.orderFries(3);
		System.out.print("The total amount is "+customer.calculateTotalAmount(2, 3));
	}
}
