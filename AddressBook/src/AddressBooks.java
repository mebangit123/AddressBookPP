import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class AddressBooks {
	private String name;
	private static Map<String, AddressBooks> map = new HashMap<>();
	private static Set<Person> contact = new HashSet<>();

	public AddressBooks() {
	}

	public AddressBooks(String name, Set<Person> contact) {
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "AddressBooks [name=" + name + " " + contact;
	}
	private static Scanner sc = new Scanner(System.in);
	public static void addContact() {
		int exit = 0;
		while (exit != 2) {
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
			if (!checkDuplicate(f_name)) {
				contact.add(new Person(f_name, l_name, address, city, state, zip, phone_no, email));
			}
			System.out.println("Would you like to add someone else? 1: Yes, 2: No");
			exit = sc.nextInt();
		}
	}

	public static boolean checkDuplicate(String f_name) {
		for (Person c : contact) {
			if (c.getF_name().equals(f_name)) {
				System.out.println("Duplicate found");
				return true;
			}
		}
		return false;
	}
	public static void searchByCity_or_State() {
    	System.out.println("Enter CityName: ");
    	String city = sc.next();
    	contact.stream().filter(c -> c.getCity().equals(city)).forEach(cn -> System.out.println(cn));
    }
	//Main method.
    public static void main(String[] args) {	  	
    	Scanner sc = new Scanner(System.in);
    	int exit = 0;
    	int menu;
    	 do {
    		System.out.println(" 0. Exit. ");
      	  	System.out.println(" 1. Add Contact. ");
      	  	System.out.println(" 2. Display Contact. ");
      	  	System.out.println(" 3. Search contact by City");
        	menu = sc.nextInt();
        	switch(menu) {
        	case 1:
        		addContact();
        		break;
        	case 2:
        	map.put("Family", new AddressBooks("Family", contact));
        	map.forEach((key, value) -> System.out.println(key + " : " + value));
        	break;
        	case 3:
        		searchByCity_or_State();
        		break;
        	default:
        		System.out.println("Invalid Input...");
        	}	
    	}while(menu != exit);
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
	public Person() {
		// TODO Auto-generated constructor stub
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
