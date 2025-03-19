package day3program;
import java.util.*;
class Library{
	String title;
	String author;
	int bookid;
	double price;
	
	Library(int bookid,String Title,String author,double price){
	this.bookid=bookid;
	this.title=Title;
	this.author=author;
	this.price=price;
	}
	
	void Displaydata() {
		System.out.println("The title name is: "+title);
		System.out.println("The author is: "+author);
		System.out.println("The bookid is: "+bookid);
		System.out.println("The price is: "+price);
		
	}
}
public class Task {
	public static void main(String[] args) {
		Library l1 = new Library(23,"Palace","Stephen king",400);
		l1.Displaydata();

}
}
