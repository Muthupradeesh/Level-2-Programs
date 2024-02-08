package rajeesan.flightticketbooking.addflight;

import java.util.ArrayList;

import rajeesan.flightticketbooking.Main;
import rajeesan.flightticketbooking.dto.Flight;

public class AddFlightView {
	AddFlightViewModel addFlightViewModel;
	public AddFlightView() 
	{
		addFlightViewModel = new AddFlightViewModel();
	}
	public void start()
	{
		ArrayList<String> temp=new ArrayList<>();
		System.out.println("Enter the Flight Number ");
		String flightNumber=Main.scanner.next();
		System.out.println("Enter the Flight Name ");
		String flightName=Main.scanner.next();
		System.out.println("Enter the DepartureTime ");
		String departureTime=Main.scanner.next();
		System.out.println("Enter the  ArivalTime ");
		String arivalTime=Main.scanner.next();
		System.out.println("Enter the no of Routes ");
		int noOfRoutes=Main.scanner.nextInt();
		System.out.println("Enter Airports : ");
		for(int i=0;i<noOfRoutes;i++)
		{
			temp.add(Main.scanner.next());
		}
		System.out.println("Enter fare Amount ");
		int fare=Main.scanner.nextInt();
		System.out.println("Enter fare NoofSeats ");
		int totalSeats=Main.scanner.nextInt();
		System.out.println("Enter Starting Of PNR: ");
		long pnr=Main.scanner.nextLong();
		Flight flight=new Flight(flightNumber,flightName,departureTime,arivalTime,noOfRoutes,temp,totalSeats,fare,pnr);
		if(addFlightViewModel.addFlight(flight))
			System.out.println("Train Added SuccessFully......");
		
	   
	}

}
