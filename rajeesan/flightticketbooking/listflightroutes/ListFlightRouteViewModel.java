package rajeesan.flightticketbooking.listflightroutes;

import java.util.ArrayList;

import rajeesan.flightticketbooking.dto.Flight;
import rajeesan.flightticketbooking.repository.Repository;

public class ListFlightRouteViewModel {

	public ArrayList<String> findFlight(String flightNumber) {
		ArrayList<String> temp = new ArrayList<>();
		Flight flight = Repository.getInstance().getFlightById(flightNumber);
		temp = flight.getRoute();
		return temp;
	}

}
