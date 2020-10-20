
public class student {

	//Instance variable
	private String firstName;
	private String lastName;
	
	//Default Constructor
	public student(String fName, String lName) {
		
		if(fName == "") {
			System.out.println("unknown");
		} else {
			firstName = fName;
		}
		if(lName == "") {
			System.out.println("unknown");
		} else {
			lastName = lName;
		}
	}
	
	// @return first name
	public String getFirstName() {
		return firstName;
	}
	
	
	// @return last name
	public String getLastName() {
		return lastName;
	}
}
