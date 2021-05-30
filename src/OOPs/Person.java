package OOPs;

public class Person {
	
	 private String name;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		
		if(age<0)
			throw new Exception("Age cannot be negative");
		this.age = age;
		
	}

	private int age;
	
	public static void main(String[] args) {
		 Person P = new Person();
		  P.age = 10;
		  
		  System.out.println(P.age);
		  
		  P.age = -10; //age cannot be negative
		  System.out.println(P.age);
	}

	//case 3
	// try{
//	if(age<0)
//		throw new Exception("age cannot be negative");
//	this.age = age;
//}catch(Exception e){

//}
	
}
