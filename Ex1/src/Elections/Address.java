package id311148720_id207324547;

public class Address {

	private String city;
	private String name;
	private int num;

	public Address(String city, String name, int num) {
		this.setCity(city);
		this.setName(name);
		this.setNum(num);
	}

	public Address(Address other) {

		this(other.city, other.name, other.num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean equal(Object other) {

		if (!(other instanceof Address)) {
			return false;
		}
		Address temp = (Address) other;
		return temp.name.equals(this.name) && temp.city.equals(this.city) && temp.num == this.num;

	}

	public String toString() {

		return "Address ditialis! " + "\n" + "The city is; " + city + "\n" + "The address name is :" + name + "\n"
				+ "The address number is ;" + num + "\n\n" ;
	}

}
