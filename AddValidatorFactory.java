package temp;

import java.util.HashMap;

public class AddValidatorFactory {
	
	static HashMap<String,Validator> CountryToValidation;
  //  Validator v=new IndiaValidator();
	
	static AddValidatorFactory first;
	private AddValidatorFactory()
	{
		CountryToValidation =new HashMap<>();
		CountryToValidation.put("in",new IndiaValidator());
		//CountryToValidation.put("usa",new UsaValidator());
	}

  public static AddValidatorFactory getInstance()
  {
	if(first==null)
	{
		first=new AddValidatorFactory();
	}
	
	  return first;
  }
  public static Validator getCountryKey(String country)
  {
	  
	  if(!CountryToValidation.containsKey(country))
	  {
		  //throw exception
		  //create throw class
		  System.out.println("exception not available country");
		  return CountryToValidation.get(country);
	  }
	  else {
		  return CountryToValidation.get(country);
	  }
  }
}
