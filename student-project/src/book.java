
public class Book {

	private String bookTitle;
	private String firstName;
	private String lastName;
	private int year;
	private double price;
	
	public Book(String bName, String aFName, String aLName, int pYear, double price) {
		
		if(bName == "" || bName == null) {
			bookTitle = "Unknown";
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
		
		this.price= price;
		
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
	
	public double getPrice() {
		return price;
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
	
	public void setPrice(double bPrice, double tax) {
		if(bPrice < 0) {
			this.price = 0;
		} else {
			this.price = bPrice + ((bPrice * tax)/100);
		}
	}
	
	

}

//title: " " Auther : firstname lastname published in year