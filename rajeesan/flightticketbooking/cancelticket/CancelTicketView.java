package rajeesan.flightticketbooking.cancelticket;

import rajeesan.flightticketbooking.Main;

public class CancelTicketView {
	CancelTicketViewModel cancelTicketViewModel;
	public CancelTicketView()
	{
		cancelTicketViewModel=new CancelTicketViewModel();
	}
	public void start()
	{
		System.out.println("Enter PNR Number : ");
		long pnr=Main.scanner.nextLong();
		if(cancelTicketViewModel.cancelTicket(pnr));
		{
			System.out.println("Cancelled SuccessFully......");
		}
	}
	

}
