public class Contacts {
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone_no;
	private String email;

	
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
	
	
	
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacts [FirstName=" + f_name + " LastName=" + l_name + " Address=" + address + " City=" + city
				+ " State=" + state + " Zip=" + zip + " Phone_no=" + phone_no + " EmailID=" + email + "]";
	}
}
