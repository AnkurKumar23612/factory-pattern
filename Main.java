package temp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Address a=new Address();
		a.setCountry("in");
		a.setZipCode("123");
		 boolean ans=	Order.validate(a);
		System.out.println(ans);
        Address a1=new Address();
		a1.setCountry("in");
		a1.setZipCode("1234");
	   ans=	Order.validate(a1);
		System.out.println(ans);
	}

}
