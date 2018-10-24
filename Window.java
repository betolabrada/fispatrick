import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Window extends JFrame{
		private GUISalida gs;
		public Window() {
			super("Parkinglot");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//this.setSize(800 , 600); //(width , heigth)
			ParkingLot pl = new ParkingLot();
			GUIEntrada g1 = new GUIEntrada(pl);
			GUISalida g2 = new GUISalida(pl);
			this.gs = g2;
			this.add(g1); //agregar un panelDibujo al contenedor de la ventana
			//this.add(new PanelControles(pd), BorderLayout.WEST); //agregamos el panel controles en el oeste de la ventana
			this.pack();
			this.setVisible(true);
			
		}
		public GUISalida getGS() {
			return this.gs;
		}
		public static void main(String[] args) {
			//JFrame ventana = new JFrame("Mi primer ventana en Java");
			//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//ventana.setVisible(true);
			
			Window myWindow  = new Window();
			Window2 myWindow2 = new Window2(myWindow.getGS());
			
			
		}

	
}
