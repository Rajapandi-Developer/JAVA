package ZOHO_3;

import java.util.Scanner;

public class TrainMain {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Welcome to the IRCTC Railway Reservation Booking");
		boolean carryon=true;
		while(carryon) {
			System.out.println("***************************");
			System.out.println("For Booking Press 1 \nFor Confirmation Press 2");
			System.out.println("For Cancellation Press 3 \nFor Availability Press 4");
			System.out.println("To Exit the Application Press 5");
			System.out.println("***************************");
			int input=sr.nextInt();
			sr.nextLine();
			switch(input) {
			
				case 1:{
					System.out.println("Enter Your Details");
					System.out.print("Name: ");
					String name=sr.nextLine();
					System.out.print("Age: ");
					String age=sr.nextLine();
					System.out.print("Berth Preferance (U/M/L): ");
					String berth=sr.nextLine();
					Passengers p=new Passengers(name, age, berth);
					book(p);
					break;
				}
				case 2:{					
					BookTicket booker=new BookTicket();
					booker.passengerDetails();
					break;
				}
				case 3:{
					System.out.print("Enter your Passenger ID:");
					int id=sr.nextInt();
//					sr.nextLine();
					canceller(id);
					break;
				}
				case 4:{
					System.out.println("Available Lower Berth->"+BookTicket.availableLowerBerth);
					System.out.println("Available Upper Berth->"+BookTicket.availableUpperBerth);
					System.out.println("Available Middle Berth->"+BookTicket.availableMiddleBerth);
					System.out.println("Available RAC ->"+BookTicket.availableRac);
					System.out.println("Available Waiting List->"+BookTicket.availableWl);
					break;
				}
				case 5:{
					carryon=false;
					System.out.println("See you later on");
					break;
				}
			}
		}
		sr.close();
	}

	private static void canceller(int id) {
		BookTicket book2=new BookTicket();
		System.out.println(BookTicket.details.get(id));
		if(!BookTicket.details.containsKey(id))
			System.out.println("Passenger details Unknown");
		else
			book2.cancel(id);
	}

	public static void book(Passengers p) {
		BookTicket ticket=new BookTicket();
		if(BookTicket.availableWl==0) {
			System.out.println("No Seats are Available");
			return;
		}
		
		if(p.berth.equals("L") && BookTicket.availableLowerBerth>0 ||
				p.berth.equals("M") && BookTicket.availableMiddleBerth>0 ||
				p.berth.equals("U") && BookTicket.availableUpperBerth>0) {
			if(p.berth.equals("L")) {
				System.out.println("Lower Berth is alloted");
				ticket.book(p, BookTicket.lowerBerthSeats.get(0),p.berth);
				BookTicket.lowerBerthSeats.remove(0);
				BookTicket.availableLowerBerth--;
				System.out.println("Your Passenger ID is: "+p.passenger_id);
			}
			
			else if(p.berth.equals("M")) {
				System.out.println("Middle Berth is alloted");
				ticket.book(p, BookTicket.MiddleBerthSeats.get(0),p.berth);
				BookTicket.MiddleBerthSeats.remove(0);
				BookTicket.availableMiddleBerth--;
				System.out.println("Your Passenger ID is: "+p.passenger_id);
			}
			else if(p.berth.equals("U")) {
				System.out.println("Upper Berth is alloted");
				ticket.book(p, BookTicket.UpperBerthSeats.get(0),p.berth);
				BookTicket.UpperBerthSeats.remove(0);
				BookTicket.availableUpperBerth--;
				System.out.println("Your Passenger ID is: "+p.passenger_id);
			}
		}
		
		else if(BookTicket.availableLowerBerth>0) {
			System.out.println("Lower Berth is alloted");
			ticket.book(p, BookTicket.lowerBerthSeats.get(0),p.berth);
			BookTicket.lowerBerthSeats.remove(0);
			BookTicket.availableLowerBerth--;
			System.out.println("Your Passenger ID is: "+p.passenger_id);
		}
		
		else if(BookTicket.availableMiddleBerth>0) {
			System.out.println("Middle Berth is alloted");
			ticket.book(p, BookTicket.MiddleBerthSeats.get(0),p.berth);
			BookTicket.MiddleBerthSeats.remove(0);
			BookTicket.availableMiddleBerth--;
			System.out.println("Your Passenger ID is: "+p.passenger_id);
		}
		
		else if(BookTicket.availableUpperBerth>0) {
			System.out.println("Upper Berth is alloted");
			ticket.book(p, BookTicket.UpperBerthSeats.get(0),p.berth);
			BookTicket.UpperBerthSeats.remove(0);
			BookTicket.availableUpperBerth--;
			System.out.println("Your Passenger ID is: "+p.passenger_id);
		}
		
		else if(BookTicket.availableRac>0) {
			System.out.println("Ticket moves to RAC");
			ticket.addtoRac(p, BookTicket.RACSeats.get(0),"RAC");
			BookTicket.RACSeats.remove(0);
			BookTicket.availableRac--;
			System.out.println("Your Passenger ID is: "+p.passenger_id);
		}
		
		else if(BookTicket.availableWl>0) {
			System.out.println("Ticket moves to Waiting List");
			ticket.addtoWL(p, BookTicket.WaitingListSeats.get(0),"Waiting List");
			BookTicket.WaitingListSeats.remove(0);
			BookTicket.availableWl--;
			System.out.println("Your Passenger ID is: "+p.passenger_id);
		}
	}
	
	
}













