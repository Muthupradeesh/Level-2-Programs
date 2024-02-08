package rajeesan.flightticketbooking.dto;

import java.util.ArrayList;

public class Flight {
	public Flight( String flightNumber, String flightName, String departureTime, String arivalTime,
			int noOfRoute, ArrayList<String> route, int totalSeats, int fare,Long pnr) {
		super();
		this.pnr = pnr;
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arivalTime = arivalTime;
		this.noOfRoute = noOfRoute;
		this.route = route;
		this.totalSeats = totalSeats;
		this.fare = fare;
	}

	Long pnr;
	
	String flightNumber;
	String flightName;
	String departureTime;
	String arivalTime;
	int noOfRoute;
	ArrayList<String> route = new ArrayList<String>();
	int totalSeats;
	int fare;
	public Long getPnr() {
		return pnr;
	}

	public void setPnr(Long pnr) {
		this.pnr = pnr;
	}


	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArivalTime() {
		return arivalTime;
	}

	public void setArivalTime(String arivalTime) {
		this.arivalTime = arivalTime;
	}

	public int getNoOfRoute() {
		return noOfRoute;
	}

	public void setNoOfRoute(int noOfRoute) {
		this.noOfRoute = noOfRoute;
	}

	public ArrayList<String> getRoute() {
		return route;
	}

	public void setRoute(ArrayList<String> route) {
		this.route = route;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}
