package AbstractFactoryDesignPattern;

public class FactoryProducer {
	public AbstractFactory getFactory(String name) {
		if(name.equalsIgnoreCase("Eamcet"))
			return new Eamcet_Students();
		else if(name.equalsIgnoreCase("Ecet"))
			return new Ecet_Students();
		return null;
	}
}
