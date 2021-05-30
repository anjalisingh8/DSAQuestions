package OOPs;

public class Pclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//P.age = -10;not visible as variable is private
		
		try {
		Person P = new Person();
		 P.setAge(-40);
		 System.out.println(P.getAge());
		}
		catch(Exception e) {
			System.out.println("in Catch");
			//e.printStackTrace(); code will not be terminated.
			System.out.println(e.getMessage());
		}
		 
		 System.out.println("bye");

	}

}
