package temp;

public class IndiaValidator implements Validator{
	
	public  boolean validate(String zipcode)
	{
		if(zipcode.length()==3)
		{
			return true;
		}
		return false;
	}

}
