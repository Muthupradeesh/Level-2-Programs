package rajeesan.flightticketbooking.bookticket;

import java.util.ArrayList;

import rajeesan.flightticketbooking.Main;
import rajeesan.flightticketbooking.dto.Flight;
import rajeesan.flightticketbooking.dto.Passenger;

public class BookTicketView {
	BookTicketViewModel bookTicketViewModel;
	ArrayList<Flight> temp=new ArrayList<>();
	public BookTicketView() 
	{
		bookTicketViewModel = new BookTicketViewModel();
	}
	public void start()
	{
		while(true)
		{
		System.out.println("Enter From Airport: ");
		String from=Main.scanner.next();
		System.out.println("Enter to AirPort :");
		String to=Main.scanner.next();
		ArrayList<Flight> temp=bookTicketViewModel.checkAvailablity(from,to);
		if(temp.isEmpty())
		{
			System.out.println("Flight Not Available from this Route....");
			break;
		}
		else
		{
			for(int i=0;i<temp.size();i++)
			{
			    System.out.println("Flight No :"+temp.get(i).getFlightNumber()+" || "+"Flight Name :"+temp.get(i).getFlightName()+" || "+"DepartureTime :"+temp.get(i).getDepartureTime()+" || "+"ArivalTime :"+temp.get(i).getArivalTime()+" || "+"No Of Seats :"+temp.get(i).getTotalSeats()+" || "+"Fare :"+temp.get(i).getFare());
			    System.out.println();
			    System.out.println();
			}
		}
		System.out.println("Enter Passenger Name ");
		String passengerName=Main.scanner.next();
		System.out.println("Enter Passenger Id ");
		String passengerId=Main.scanner.next();
		System.out.println("Enter the Gender :");
		String gender=Main.scanner.next();
		System.out.println("Enter Passenger Age : ");
		byte age=Main.scanner.nextByte();
		System.out.println("Contact Number :");
		String contactNo=Main.scanner.next();
		System.out.println("Enter Flight Number :");
		String FlightNo=Main.scanner.next();
		Passenger passenger=new Passenger(passengerName,passengerId,gender,age,contactNo,FlightNo) ;
		if(bookTicketViewModel.book(passenger))
			System.out.println("Booked Successfully......");
		else 
			System.out.println("Thankyou.....");
		
	}
		
	}

}
