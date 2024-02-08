package rajeesan.flightticketbooking.addflight;

import rajeesan.flightticketbooking.dto.Flight;
import rajeesan.flightticketbooking.repository.Repository;

public class AddFlightViewModel {
	public boolean addFlight(Flight flight)
	{
		boolean flag=false;
		Repository.getInstance().addFlightList(flight);
		return true;
	}

}
