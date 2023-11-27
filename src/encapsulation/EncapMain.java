package encapsulation;

public class EncapMain {

	public static void main(String[] args) {
	Encap1 E=new Encap1();
	E.setAge(30);
	E.setName("Raja");
	E.setGender("Male");
	E.setPhone("6548883057");
	E.setEmail("ttf912816@gmail.com");
	E.setAddress("abcdef");
	System.out.println(E.getAge());
	System.out.println(E.getName());
	System.out.println(E.getGender());
	System.out.println(E.getPhone());
	System.out.println(E.getEmail());
	System.out.println(E.getAddress());

	}

}
