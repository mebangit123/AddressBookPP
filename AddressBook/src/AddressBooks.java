import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class AddressBooks {
	
	private static Set<Person> contact = new HashSet<>();
	
	public static void displayContact() {
    	if(contact.isEmpty())
    		System.out.println("The list is empty");
    	for(Person c : contact) {
    		System.out.println(c);
    	}
	}
    
	public static void addContact() {    	
		Scanner sc = new Scanner(System.in);    
    	int menu = 0; 
    	while (menu != 2) { 
    		System.out.println("Enter First Name: "); 
		    String f_name = sc.next(); 
		    System.out.println("Enter Last Name: "); 
		    String l_name = sc.next(); 
		    System.out.println("Enter email: "); 
		    String email = sc.next();
		    System.out.println("Enter Address: "); 
		    String address = sc.next();
		    System.out.println("Enter City: "); 
		    String city = sc.next();
		    System.out.println("Enter State: "); 
		    String state = sc.next();
		    System.out.println("Enter Zip: "); 
		    int zip = sc.nextInt();
		    System.out.println("Enter Phone_NO: "); 
		    int phone_no = sc.nextInt();
		    contactList(new Person(f_name, l_name, address, city, state, zip, phone_no, email));
		    System.out.println("Would you like to add someone else? 1: Yes, 2: No"); 
		    menu = sc.nextInt();
    	}
	} 		  
    private static void contactList(Person person) {
    	contact.add(person);
    }
    public static void main(String[] args) {	  	
    	addContact();
    	displayContact();
   }
}

class Person {
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone_no;
	private String email;
	
	public Person(String f_name, String l_name, String address, String city, String state, int zip, int phone_no,
			String email) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_no = phone_no;
		this.email = email;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(f_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(f_name, other.f_name);
	}
	@Override
	public String toString() {
		return "Contact: FirstName=" + f_name + ", LastName=" + l_name + ", Address=" + address + ", City=" + city + ", State="
				+ state + ", Zip=" + zip + ", Phone_no=" + phone_no + ", Email=" + email;
	}
}
