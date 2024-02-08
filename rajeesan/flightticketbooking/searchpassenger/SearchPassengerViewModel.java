package rajeesan.flightticketbooking.searchpassenger;

import java.util.ArrayList;

import rajeesan.flightticketbooking.repository.Repository;
import rajeesan.flightticketbooking.dto.Passenger;

public class SearchPassengerViewModel {

	public void searchPassenger(String passengerId) {
		ArrayList<Passenger> temp = Repository.getInstance().getPassengerList();
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getPassengerId().equals(passengerId)) {
				System.out.println(" Passenger Name" + temp.get(i).getPassengerName() + "  || " + " Passenger Id"
						+ temp.get(i).getPassengerId() + " || " + " AllotedSeat " + temp.get(i).getPassengerName()
						+ " || " + " Passenger PNR : " + temp.get(i).getPnr() + " || " + "travelling Flight No "
						+ temp.get(i).getFlightNo());
				System.out.println();

			}
		}
	}

}
