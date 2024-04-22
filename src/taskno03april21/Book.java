package taskno03april21;

//Question No.01
public class Book {
	int bookID;
	String title;
	String author;
	String isAvailable;
	public void  Book(int bookID, String title, String author, String isAvailable) {
		
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	public Book() {
		
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
 public void search()
 {
	 System.out.println("Book-ID: "+bookID+"\nBook-Title: "+title+"\nBook-Author: "+author);
 }

	

}
