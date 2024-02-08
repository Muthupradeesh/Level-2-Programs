package rajeesan.flightticketbooking.dto;

public class Passenger {

	String passengerName;
	String passengerId;
	String gender;
	byte age;
	String contactNo;
	String FlightNo;
	String allotedSeat;
	long pnr;

	

	public Passenger(String passengerName, String passengerId, String gender, byte age, String contactNo,
			String flightNo) {
		super();
		this.passengerName = passengerName;
		this.passengerId = passengerId;
		this.gender = gender;
		this.age = age;
		this.contactNo = contactNo;
		FlightNo = flightNo;
	}

	public String getFlightNo() {
		return FlightNo;
	}

	public void setFlightNo(String flightNo) {
		FlightNo = flightNo;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAllotedSeat() {
		return allotedSeat;
	}

	public void setAllotedSeat(String allotedSeat) {
		this.allotedSeat = allotedSeat;
	}
	public long getPnr() {
		return pnr;
	}

	public void setPnr(long pnr) {
		this.pnr = pnr;
	}


}
