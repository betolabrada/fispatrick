import java.time.LocalTime;

public class Ticket {
	private LocalTime timeEnter,
						timeExit;
	private double price;
	
	public Ticket(){
		this.timeEnter = LocalTime.now();
		this.price = 0;
	}
	
	public void setTimeExit(LocalTime t) {
		this.timeExit = t;
	}
	
	public void setPrice(double price) {
		this.price= price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int setTimeSpent() {
		int timeSpent = this.timeExit.getSecond() - this.timeEnter.getSecond();
		//this.timeExit.getHour() - this.timeEnter.getHour();
		/*if(this.timeExit.getMinute() - this.timeEnter.getMinute()!=0 || this.timeExit.getSecond() - this.timeEnter.getSecond()!=0) {
			timeSpent += 1;
		}*/
		return timeSpent;
	}


	/*public static void main(String[] args) {
		Ticket t = new Ticket();
		System.out.println(t.setTimeSpent());
	}*/
}
