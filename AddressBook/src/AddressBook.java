import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in Master Branch");
		
		AddContact addcn = new AddContact();
		Contacts cn=addcn.addContact();
		
		List<Contacts> contact = new ArrayList<Contacts>();
		
		contact.add(cn);
	
		System.out.println(contact.get(cn.getPhone_no()));
	}
}


class AddContact {

	public Contacts addContact() {
		Contacts cn = new Contacts();
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter FirstName: ");
	String fname = sc.nextLine();
	cn.setF_name(fname);
	
	System.out.println("Enter LastName: ");
	String lname = sc.nextLine();
	cn.setL_name(lname);
	
	System.out.println("Enter Address: ");
	String address = sc.nextLine();
	cn.setAddress(address);
	
	System.out.println("Enter City: ");
	String city = sc.nextLine();
	cn.setCity(city);
	
	System.out.println("Enter State: ");
	String state = sc.nextLine();
	cn.setState(state);
	
	System.out.println("Enter Email: ");
	String emailID = sc.nextLine();
	cn.setEmail(emailID);
	
	System.out.println("Enter ZipCode: ");
	int zip = sc.nextInt();
	cn.setZip(zip);
	
	System.out.println("Enter PhoneNo: ");
	int phoneNo = sc.nextInt();
	cn.setPhone_no(phoneNo);
	
	sc.close();
	
	return cn;
	}
}