
public class Driver {
	
	public static void printStudents(Student[] studArray) {
		for(int i = 0; i < studArray.length; i++) {
			System.out.println(studArray[i].getFirstName() + " " + studArray[i].getLastName());
		}
	}
	
	public static void printBooks(Book[] bookArray) {
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getBooktName() + " Auther: " + bookArray[i].getAuthertName() + "published in " + bookArray[i].getPublishedYear() + "total payment:  " + bookArray[i].getPrice());
		}
	}
	
	public static void main(String[] args) {
//		int[] intArray = new int[3];
//		Student[] studentArray = new Student[3];
		
		Book[] BookArray = new Book[3];
//		
//		
//		studentArray[0] = new Student("John", "Doe");
//		studentArray[1] = new Student("Jane", "Dew");
//		studentArray[2] = new Student("Albert", "Dao");
//		
//		printStudents(studentArray);
		
//		student student1 = new student("John", "Doe");
//		student student2 = new student("Jane", "Dew");
//		student student3 = new student("Albert", "Dao");

//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
//		System.out.println(student3.getFirstName() + " " + student3.getLastName());
////		
//		student1.setFirstName("John");
//		student2.setFirstName("Doe");
		
//		studentArray[0].setFirstName("John");
//		studentArray[1].setLastName("John");
//		
//		System.out.println("new create one is below");
		
//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
//		System.out.println(student3.getFirstName() + " " + student3.getLastName());
//		
//		
//		
		BookArray[0] = new Book("Naruto", "ami", "smith", 1993, 20.5);
		BookArray[1] = new Book("Yamato", "sasa", "mumu", 1789, 12.3);
		BookArray[2] = new Book("One Piece", "John", "Jump", 2000, 10.5);
		
		printBooks(BookArray);
		
		BookArray[0].setBookName("Harrypotter");
		BookArray[0].setPublishedYear(1500);
		BookArray[0].setPrice(12.0, 12);
		
		printBooks(BookArray);
		
//		student2.setFirstName("Doe");
		
		
		
		
		
	}


}
