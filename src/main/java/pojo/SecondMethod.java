package pojo;

public class SecondMethod {
	
	public static void main(String[] args) {
		
		FirstMethod first= new FirstMethod();
		first.setFirstName("Hari");
		first.setSecondName("Haran");
		first.setAddress("Madurai");
		
		System.out.println(first.getFirstName());
		System.out.println(first.getSecondName());
		System.out.println(first.getAddress());
		
		
	}
}
