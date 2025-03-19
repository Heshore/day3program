package day3program;
class Dessert{
	String Item;
	int quantity;
	Dessert(){
		Item="cake";
	}
	Dessert(int quantity){
		this.quantity=quantity;
	}
	void display() {
		System.out.println("The Dessert name is "+Item);
		
	}
}

public class Constructor {
	public static void main(String[] args) {
		Dessert d1=new Dessert();
		d1.display();	}

}

