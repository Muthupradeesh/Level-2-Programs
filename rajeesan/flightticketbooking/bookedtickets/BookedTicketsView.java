package rajeesan.flightticketbooking.bookedtickets;

import java.util.ArrayList;

import rajeesan.flightticketbooking.dto.Passenger;

public class BookedTicketsView {
	BookedTicketsViewModel bookedTicketsViewModel;

	public BookedTicketsView() {
		bookedTicketsViewModel = new BookedTicketsViewModel();
	}

	public void start() {
		ArrayList<Passenger> temp = bookedTicketsViewModel.getPaseengerList();
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(" Passenger Name" + temp.get(i).getPassengerName() + "  || " + " Passenger Id"
					+ temp.get(i).getPassengerId() + " || " + " AllotedSeat " + temp.get(i).getPassengerName() + " || "
					+ " Passenger PNR : " + temp.get(i).getPnr() + " || " + "travelling Flight No "
					+ temp.get(i).getFlightNo());
			System.out.println();
		}
	}

}
