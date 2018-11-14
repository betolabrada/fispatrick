import java.time.LocalTime;

public class ParkingLot {
	
	private boolean lleno;
	private int numCarros,
				numFallos,
				customer,
				income;
	private LocalTime time;				
	private Ticket tickets[];
				
	private final int MaxCarros = 120;
	
	public ParkingLot() {
		this.numCarros = 0;
		this.numFallos = 0;
		this.time = LocalTime.now();
		this.tickets = new Ticket[120];
		/*for(int i = 0; i<120; i++) {
			tickets[i] = null;
		}*/
		Ticket t = new Ticket();
		this.tickets[0] = t;
	}
	
	public boolean isLleno() {
		return lleno;
	}
	
	public void setLleno(boolean bool) {
		this.lleno = bool;
	}

	public int getNumCarros() {
		return numCarros;
	}

	public int getNumFallos() {
		return numFallos;
	}

	public int getCustomer() {
		return customer;
	}

	public int getIncome() {
		return income;
	}

	public int getLugaresDisponibles() {
		
		if ( this.isLleno() == true) return 0;
		return MaxCarros - numCarros;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public double calculatePrice(int numTicket) {
		if(this.tickets[numTicket]!=null) {
			this.tickets[numTicket].setTimeExit(LocalTime.now());
			this.tickets[numTicket].setPrice(this.tickets[numTicket].setTimeSpent()*2);
			return this.tickets[numTicket].getPrice();
		}else {
			return 0;
		}
	}
	
	public void deleteCar(int numTicket) {
		if(this.tickets[numTicket]!=null) {
			this.tickets[numTicket] = null;
		}
		if(this.numCarros > 0) {
			this.numCarros -= 1;
		}else {
			System.out.println("El estacionamiento esta vacio");
		}
	}
	
	/*public double getDollars(double tiempoFinal, double tiempoInicial) {
		
		//double precio = 15;
		double time = tiempoFinal - tiempoInicial;
		double total = 0.00;
		
		for( int i = 0; i < 24; i++) {
			
			if ( time <= (i+1) * 60) {
				
				total = (i+1) * 15;
				break;
			}
		}
		
		return total;
		
	}*/
	
	public double getPesos(int numTicket) {
		double price = this.tickets[numTicket].getPrice();
		return price;
	}
	
	public void incrementCarros() {
		Ticket t = new Ticket();
		for(int i = 0; i<120; i++) {
			if(this.tickets[i]==null) {
				this.tickets[i] = t;
				break;
			}
		}
		this.numCarros += 1;
	}
	
	public void decrementCarros() {
		if(this.numCarros > 0) {
			this.numCarros -= 1;
		}else {
			System.out.println("El estacionamiento esta vacio");
		}
	}
	
	public void incrementFallas() {
		
		this.numFallos += 1;
		System.out.println("car did not enter");
	}


	public static void main(String[] args) {
		
		ParkingLot pl = new ParkingLot();
		
		System.out.println(pl.isLleno());
		System.out.println(pl.getLugaresDisponibles());
		pl.incrementCarros();
		System.out.println(pl.getLugaresDisponibles());
		pl.decrementCarros();
		System.out.println(pl.getLugaresDisponibles());
		
		//System.out.println(pl.getPesos(65, 0));
		System.out.println(pl.time);
		
		
	}

}
