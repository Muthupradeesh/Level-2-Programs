package rajeesan.flightticketbooking.bookedtickets;

import java.util.ArrayList;

import rajeesan.flightticketbooking.dto.Passenger;
import rajeesan.flightticketbooking.repository.Repository;

public class BookedTicketsViewModel {

	public ArrayList<Passenger> getPaseengerList() {
		ArrayList<Passenger> temp = Repository.getInstance().getPassengerList();
		if (!Repository.getInstance().getWaitingList().isEmpty()) {
			for (int i = 0; i < Repository.getInstance().getWaitingList().size(); i++) {
				temp.add(Repository.getInstance().getWaitingList().poll());
			}
		}
		return temp;
	}

}
