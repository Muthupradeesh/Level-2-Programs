package rajeesan.flightticketbooking.getpnrstatus;

import java.util.ArrayList;

import rajeesan.flightticketbooking.dto.Passenger;
import rajeesan.flightticketbooking.repository.Repository;

public class PnrStatusViewModel {

	public Passenger pnrstatus(Long pnr) {
		ArrayList<Passenger> temp = Repository.getInstance().getPassengerList();
		if (!Repository.getInstance().getWaitingList().isEmpty()) {
			for (int j = 0; j < Repository.getInstance().getWaitingList().size(); j++) {
				temp.add(Repository.getInstance().getWaitingList().poll());
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getPnr() == pnr) {

				return temp.get(i);
			}
		}

		return null;
	}

}
