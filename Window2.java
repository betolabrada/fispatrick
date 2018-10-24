import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Window2 extends JFrame{
		public Window2(GUISalida gs) {
			super("Parkinglot");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//this.setSize(800 , 600); //(width , heigth)
			//agregar un panelDibujo al contenedor de la ventana
			//this.add(new PanelControles(pd), BorderLayout.WEST); //agregamos el panel controles en el oeste de la ventana
			this.add(gs);
			this.pack();
			this.setVisible(true);
			
		}


	
}
