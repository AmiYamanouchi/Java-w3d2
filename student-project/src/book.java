
public class Book {

	public String bookTitle;
	public String firstName;
	public String lastName;
	public int year;
	
	public Book(String bName, String aFName, String aLName, int pYear) {
		
		if(bName == "") {
			System.out.println("unknown");
		} else {
			bookTitle = bName;
		}
		
		if(aFName == "") {
			firstName = "John";
		} else {
			firstName = aFName;
		}
		
		if(aLName == "") {
			lastName = "Doe";
		} else {
			lastName = aLName;
		}
		
		if(pYear < 1900) {
			year = 1900;
		} else {
			year = pYear;
		}
		
		
	}
	
	//get
	
	public String getBooktName() {
		return bookTitle;
	}
	
	public String getAuthertName() {
		return firstName + " " + lastName;
	}
	
	public int getPublishedYear() {
		return year;
	}
	
	
	//set 
	
	public void setBookName(String bName) {
		if(bName == "" || bName == null) {
			bookTitle = "Unknown";
		} else {
			bookTitle = bName;
		}
	}
	
	public void setAutherName(String aFName, String aLName) {
		if(aFName == "") {
			firstName = "John";
		} else {
			firstName = aFName;
		}
		
		if(aLName == "") {
			lastName = "Doe";
		} else {
			lastName = aLName;
		}
		
	}
	
	public void setPublishedYear(int pYear) {
		if(pYear < 1900) {
			year = 1900;
		} else {
			year = pYear;
		}
	}
	
	

}

//title: " " Auther : firstname lastname published in year