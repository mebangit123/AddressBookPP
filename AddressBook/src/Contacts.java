
public class Contacts {
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone_no;
	private String email;
	
	
	
	public Contacts(String f_name, String l_name, String address, String city, String state, int zip, int phone_no,
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
	public String getL_name() {
		return l_name;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public int getPhone_no() {
		return phone_no;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Contacts [FirstName=" + f_name + " LastName=" + l_name + " Address=" + address + " City=" + city
				+ " State=" + state + " Zip=" + zip + " Phone_no=" + phone_no + " EmailID=" + email + "]";
	}
}
