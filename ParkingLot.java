import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Random;

public class ParkingLot {
	
	private boolean lleno;
	private int numCarros,
				numFallos,
				customer,
				income,
				numRandom;
	private LocalTime time;				
	private Ticket tickets[];
	private PrintWriter pw;
				
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
		try {
			this.pw = new PrintWriter(new FileWriter("D:\\ParkingLot.csv"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.pw.println("Ventas del día");
		this.pw.print("Hora de entrada: "+",");
		this.pw.print("Hora de salida: "+",");
		this.pw.println("Precio: ");
		
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
	
	public int GenerateRandom() {
		Random rand = new Random();
		int r;
		if(this.numCarros>0) {
			r = rand.nextInt(this.numCarros)+1;
			if(this.tickets[r]==null) {
				GenerateRandom();
			}
			return r;
		}else {
			return 0;
		}
		
	}
	
	public double calculatePrice(int numTicket) {
		if(this.tickets[numTicket]!=null) {
			this.tickets[numTicket].setTimeExit(LocalTime.now());
			this.tickets[numTicket].setPrice(this.tickets[numTicket].setTimeSpent()*2);
			this.income += this.tickets[numTicket].getPrice();
			printInExcel(numTicket);
			return this.tickets[numTicket].getPrice();
		}else {
			return 0;
		}
	}
	
	public void printInExcel(int numTicket) {
		this.pw.print(this.tickets[numTicket].getTimeEnter() + ",");
		this.pw.print(this.tickets[numTicket].getTimeExit() + ",");
		this.pw.println(this.tickets[numTicket].getPrice());
	}
	
	public void closeFile() {
		this.pw.close();
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
	
	public void incrementFallas() {
		
		this.numFallos += 1;
		System.out.println("car did not enter");
	}

}
