package rajeesan.flightticketbooking.cancelticket;

import java.util.ArrayList;

import rajeesan.flightticketbooking.dto.Passenger;
import rajeesan.flightticketbooking.repository.Repository;

public class CancelTicketViewModel {

	public boolean cancelTicket(long pnr) {

		ArrayList<Passenger> temp = Repository.getInstance().getPassengerList();
		if (!Repository.getInstance().getWaitingList().isEmpty()) {
			for (int i = 0; i < Repository.getInstance().getWaitingList().size(); i++) {
				temp.add(Repository.getInstance().getWaitingList().poll());
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getPnr() == pnr) {
				Repository.getInstance().removePassenger(temp.get(i));
			}
		}
		return true;
	}

}
