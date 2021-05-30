package OOPs;

public class Student {
	String name = "Rohit";
	int age = 24;
	
	public Student() {
		name = "Aman";
		age = 20;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduceyourself() {
		System.out.println(name+" is" +age+" year old.");
	}

}
