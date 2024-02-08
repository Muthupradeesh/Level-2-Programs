package rajeesan.flightticketbooking.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import rajeesan.flightticketbooking.dto.*;

public class Repository {
	public static  Repository repository ;
	ArrayList<Flight> flightList=new ArrayList<>();
	ArrayList<Passenger> passengerList=new ArrayList<>();
	
	Queue<Passenger> waitingList=new LinkedList();
	
	static public Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;

	}
	public void addFlightList(Flight flight)
	{
		flightList.add(flight);
	}
	public ArrayList<Flight> getFlightList(String from, String to) {
		ArrayList<Flight> temp=new ArrayList<>();
		for(int i=0;i<flightList.size();i++)
		{
		   if(flightList.get(i).getRoute().contains(from)&&flightList.get(i).getRoute().contains(from))
		   {
			   temp.add(flightList.get(i));
		   }
		}
		return temp;
	}
	public void addPassenger(Passenger passenger) {
		if(passenger.getAllotedSeat().equals("WL"))
			waitingList.add(passenger);
		else
		passengerList.add(passenger);	
	}
	public Flight getFlightById(String flightNo) {
		for(int i=0;i<flightList.size();i++)
		{
			if(flightList.get(i).getFlightNumber().equals(flightNo))
			{
				return flightList.get(i);
			}
		}
		return null;	
	}
	public ArrayList<Flight> getFlightList() {
		return flightList;
	}
	public void setFlightList(ArrayList<Flight> flightList) {
		this.flightList = flightList;
	}
	public ArrayList<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(ArrayList<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public Queue<Passenger> getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(Queue<Passenger> waitingList) {
		this.waitingList = waitingList;
	}
	public void removePassenger(Passenger passenger) {
		String allotedSeat=passenger.getAllotedSeat();
		Flight flight=getFlightById(passenger.getFlightNo());
		flight.setTotalSeats(flight.getTotalSeats()+1);
		passengerList.remove(passenger);
		if(!waitingList.isEmpty())
		{
			Passenger temp=waitingList.poll();
			temp.setAllotedSeat(allotedSeat);
		}
		
	}

}
