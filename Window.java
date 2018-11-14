import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Window extends JFrame{
		private GUISalida gs;
		private GUIShow gss;
		public Window() {
			super("Parkinglot");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(0,0);
			//this.setSize(800 , 600); //(width , heigth)
			ParkingLot pl = new ParkingLot();
			GUIEntrada g1 = new GUIEntrada(pl);
			GUIShow g3 = new GUIShow(pl);
			GUISalida g2 = new GUISalida(pl,g3);
			this.gs = g2;
			this.gss = g3;
			this.add(g1);
			this.pack();
			this.setVisible(true);
			
		}
		public GUISalida getGS() {
			return this.gs;
		}
		public GUIShow getGSS() {
			return this.gss;
		}
		public static void main(String[] args) {
			
			Window myWindow  = new Window();
			Window2 myWindow2 = new Window2(myWindow.getGS());
			Window3 myWindow3 = new Window3(myWindow.getGSS());
			
		}

	
}
