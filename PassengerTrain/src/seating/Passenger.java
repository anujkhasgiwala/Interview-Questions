package seating;

public class Passenger {
	private String firstName;
	private String lastName;

	//Constructor
	public Passenger(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//Getter-Setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//toString()
	@Override
	public String toString() {
		return "Passenger [First Name=" + firstName + ", Last Name=" + lastName + "]";
	}
}