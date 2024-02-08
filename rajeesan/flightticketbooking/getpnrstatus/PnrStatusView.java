package rajeesan.flightticketbooking.getpnrstatus;

import rajeesan.flightticketbooking.Main;
import rajeesan.flightticketbooking.dto.Passenger;

public class PnrStatusView {
	PnrStatusViewModel pnrStatusViewModel;

	public PnrStatusView() {
		pnrStatusViewModel = new PnrStatusViewModel();
	}

	public void start() {
		System.out.println("Enter PNR Number : ");
		Long pnr = Main.scanner.nextLong();
		Passenger passenger = pnrStatusViewModel.pnrstatus(pnr);
		if (passenger != null) {
			System.out.println("Passenger Name :" + passenger.getPassengerName() + " || " + "Ticket Status"
					+ passenger.getAllotedSeat());
		}
	}

}
