package ZOHO_3;

public class Passengers {
	static int id=1;
	String name;
	String age;
	String berth;
	int passenger_id;
	int number;
	String alloted;

	public Passengers(String name, String age, String berth) {
		this.name = name;
		this.age = age;
		this.berth = berth;
		this.number = -1;
		this.alloted = "";
		passenger_id=id;
		id++;
	}

}
