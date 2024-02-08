package rajeesan.flightticketbooking;

import java.util.ArrayList;
import java.util.Scanner;
import rajeesan.flightticketbooking.bookticket.*;
import rajeesan.flightticketbooking.cancelticket.CancelTicketView;
import rajeesan.flightticketbooking.getpnrstatus.PnrStatusView;
import rajeesan.flightticketbooking.listflightroutes.ListFlightRouteView;
import rajeesan.flightticketbooking.searchpassenger.SearchPassengerView;
import rajeesan.flightticketbooking.addflight.AddFlightView;
import rajeesan.flightticketbooking.bookedtickets.BookedTicketsView;

public class Main {
	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Main main = new Main();
		while (true) {
			main.menu();
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				AddFlightView addFlightView = new AddFlightView();
				addFlightView.start();
				break;
			case 2:
				BookTicketView bookTicketView = new BookTicketView();
				bookTicketView.start();
				break;
			case 3:
				BookedTicketsView bookedTicketsView = new BookedTicketsView();
				bookedTicketsView.start();
				break;
			case 4:
				CancelTicketView cancelTicketView = new CancelTicketView();
				cancelTicketView.start();
				break;
			case 5:
				SearchPassengerView searchPassengerView = new SearchPassengerView();
				searchPassengerView.start();
				break;
			case 6:
				PnrStatusView pnrStatusView = new PnrStatusView();
				pnrStatusView.start();
				break;
			case 7:
				ListFlightRouteView listFlightRouteView = new ListFlightRouteView();
				listFlightRouteView.start();
				break;
			case 0:
				System.exit(0);
			}

		}

	}

	public void menu() {
		System.out.println(" 1 --> Add Trains");
		System.out.println(" 2 --> Book Ttcket");
		System.out.println(" 3 --> Get PNR Status");
		System.out.println(" 4 --> Booked Tickets");
		System.out.println(" 5 --> Cancel Ticket ");
		System.out.println(" 6 --> Search Passenger");
		System.out.println(" 7 --> List Flight Route");
		System.out.println(" 0 --> Exit ");
		System.out.println("Enter Choise :: ");
	}

}
