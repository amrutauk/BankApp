public class User{
	
	String firstname="foo";
	String lastname="bar";
	
	Checking checkAccount = new Checking();
	Saving saveAccount = new Saving();

	void printUsername(){
		System.out.println(firstname);
		System.out.println(lastname);
	}
		
	void entername(String first, String last){
		firstname = first;
		lastname = last;
	}
}
