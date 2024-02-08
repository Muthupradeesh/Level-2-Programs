package rajeesan.flightticketbooking.searchpassenger;

import rajeesan.flightticketbooking.Main;

public class SearchPassengerView {
	SearchPassengerViewModel searchPassengerViewModel;

	public SearchPassengerView() {
		searchPassengerViewModel = new SearchPassengerViewModel();
	}

	public void start() {
		System.out.println("Enter the Passenger Id : ");
		String passengerId = Main.scanner.next();
		searchPassengerViewModel.searchPassenger(passengerId);

	}

}
