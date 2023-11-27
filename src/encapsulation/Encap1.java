package encapsulation;

public class Encap1 {
	int age;
	String name;
	String gender;
	String phone;
	String email;
	String addree;
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.addree=address;
	}
	public int getAge(){
		return age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return addree;
		
	}
}
