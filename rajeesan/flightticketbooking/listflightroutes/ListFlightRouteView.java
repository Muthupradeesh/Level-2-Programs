package rajeesan.flightticketbooking.listflightroutes;

import java.util.ArrayList;

import rajeesan.flightticketbooking.Main;

public class ListFlightRouteView {
	ListFlightRouteViewModel listFlightRouteViewModel;

	public ListFlightRouteView() {
		listFlightRouteViewModel = new ListFlightRouteViewModel();
	}

	public void start() {
		System.out.println("Enter the flight Number :");
		String flightNumber = Main.scanner.next();
		ArrayList<String> temp = listFlightRouteViewModel.findFlight(flightNumber);
		System.out.println("Route.....");
		for (int i = 0; i < temp.size(); i++) {
			System.out.println((i + 1) + " " + temp.get(i));
		}
	}

}
