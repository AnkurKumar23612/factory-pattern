package temp;

public class Order {

	public static boolean validate(Address a)
	{
	
		return AddValidatorFactory.getInstance().getCountryKey(a.country).validate(a.zipCode);
		
	}
}
