package rajeesan.flightticketbooking.bookticket;

import java.util.ArrayList;

import rajeesan.flightticketbooking.Main;
import rajeesan.flightticketbooking.dto.Flight;
import rajeesan.flightticketbooking.dto.Passenger;
import rajeesan.flightticketbooking.repository.Repository;

public class BookTicketViewModel {
	String from;
	String to;

	public ArrayList<Flight> checkAvailablity(String from, String to) {
		this.from = from;
		this.to = to;
		ArrayList<Flight> temp = Repository.getInstance().getFlightList(from, to);
		return temp;
	}

	public boolean book(Passenger passenger) {
		String allotedSeat = "";
		Flight flight = Repository.getInstance().getFlightById(passenger.getFlightNo());
		if (flight == null) {
			System.out.println("Wrong flight Number.....");
		} else {
			if (flight.getTotalSeats() > 0) {
				passenger.setAllotedSeat("S" + allotedSeat + flight.getTotalSeats());
				flight.setTotalSeats(flight.getTotalSeats() - 1);
			} else
				passenger.setAllotedSeat("WL");
		}
		passenger.setPnr(flight.getPnr() + 1);
		ArrayList<String> temp = flight.getRoute();
		int count = 0;
		for (int i = temp.indexOf(from); i < temp.size(); i++) {
			count++;
			if (temp.get(i).equals(to))
				break;
		}
		System.out.println("total amount :" + count * flight.getFare());
		System.out.println("press 1 --> for pay ");
		System.out.println("press 0 --> for Exit ");
		int c = Main.scanner.nextInt();
		if (c == 1) {
			Repository.getInstance().addPassenger(passenger);
			return true;
		} else
			return false;
	}

}
