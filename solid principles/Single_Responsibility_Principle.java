class ConvertToUppercase{
	public static String toUppercase(String string) {
		return string.toUpperCase();
	}
}
class ConvertToLowercase{
	public static String toLowercase(String string) {
		return string.toLowerCase();
	}
}
public class Single_Responsibility_Principle {
	public static void main(String[] args) {
		String string="ViNaY";
		System.out.println("The string in Uppercase is "+ConvertToUppercase.toUppercase(string));
		System.out.println("The string in Lowercase is "+ConvertToLowercase.toLowercase(string));
	}
}
