package fis_project;

public class ParkingLot {
	
	private boolean lleno;
	private int numCarros,
				numFallos,
				customer,
				income;
	private final int MaxCarros = 120;
	
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
	
	public double getDollars(double tiempoFinal, double tiempoInicial) {
		
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
		
	}
	
	public double getPesos(double tiempoFinal, double tiempoInicial) {
		
		return getDollars(tiempoFinal, tiempoInicial) * 19.34;
	}
	
	public void incrementCarros() {
		
		this.numCarros += 1;
		System.out.println("car entered");
	}
	
	public void decrementCarros() {
		
		this.numCarros -= 1;
		System.out.println("car exited");
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
		
		System.out.println(pl.getPesos(65, 0));
		
		
	}

}


