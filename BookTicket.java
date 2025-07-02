package ZOHO_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BookTicket {

	static int availableLowerBerth=1;
	static int availableUpperBerth=1;
	static int availableMiddleBerth=1;
	static int availableRac=1;
	static int availableWl=1;
	
	static List<Integer> lowerBerthSeats=new ArrayList<>(Arrays.asList(1));
	static List<Integer> UpperBerthSeats=new ArrayList<>(Arrays.asList(1));
	static List<Integer> MiddleBerthSeats=new ArrayList<>(Arrays.asList(1));
	static List<Integer> RACSeats=new ArrayList<>(Arrays.asList(1));
	static List<Integer> WaitingListSeats=new ArrayList<>(Arrays.asList(1));
	
	static Queue<Integer> RACPrefer=new LinkedList<>();
	static Queue<Integer> WLPrefer=new LinkedList<>();
	static List<Integer> bookedtickets=new ArrayList<>();
	
	static Map<Integer, Passengers> details=new HashMap<>();

	public void book(Passengers p, int seat, String berth) {
		p.number=seat;
		p.alloted=berth;
		details.put(p.passenger_id, p);
		bookedtickets.add(p.passenger_id);
	}

	public void addtoRac(Passengers p, int seat, String berth) {
		p.number=seat;
		p.alloted=berth;
		details.put(p.passenger_id, p);
		RACPrefer.add(p.passenger_id);
	}
	
	public void addtoWL(Passengers p, int seat, String berth) {
		p.number=seat;
		p.alloted=berth;
		details.put(p.passenger_id, p);
		WLPrefer.add(p.passenger_id);
	}

	public void cancel(int id) {
		Passengers p=details.get(id);
		details.remove(id);
		bookedtickets.remove(id-1);
		System.out.println("Cancelled SuccessFully");
		int position=p.number;
		if(p.alloted.equals("L")) {
			availableLowerBerth++;
			lowerBerthSeats.add(position);
		}
		else if(p.alloted.equals("M")) {
			availableMiddleBerth++;
			MiddleBerthSeats.add(position);
		}
		else if(p.alloted.equals("U")) {
			availableUpperBerth++;
			UpperBerthSeats.add(position);
		}
		
		if(RACPrefer.size()>0) {
			Passengers p2=details.get(RACPrefer.poll());	
			availableRac++;
			RACSeats.add(p2.number);
		
			if(WLPrefer.size()>0) {
				Passengers p3=details.get(WLPrefer.poll());
				availableWl++;
				WaitingListSeats.add(p3.number);
				
				p3.number=RACSeats.get(0);
				p3.alloted="RAC";
				RACSeats.remove(0);
				RACPrefer.add(p3.passenger_id);
				availableRac--;
			}
		TrainMain.book(p2);
		}
	}

	public void passengerDetails() {
			for(Passengers p:details.values()) {
				System.out.println("Passenger name: "+p.name);
				System.out.println("Passenger berth: "+p.berth);
			}
		
	}

	
}










