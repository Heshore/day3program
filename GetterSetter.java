package day3program;
public class GetterSetter {
	private String name;
	public String getName() {
		return name;
	}
public void setName(String name) {
	if(name !=null && !name.isEmpty()) {
		this.name=name;
	
	}else {
		System.out.println("Invalid name!");
		}

}
}

public class GetterSetter {
	public static void main(String[] args) {
		Data1 s1=new Data1();
		s1.setName("ravi");
		System.out.println("Student Name:" +s1.getname());
	}
}

