import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window2 extends JFrame{
		public Window2(GUISalida gs) {
			super("Parkinglot");
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(0,pantalla.height / 2);
			//this.setSize(800 , 600); //(width , heigth)
			//agregar un panelDibujo al contenedor de la ventana
			//this.add(new PanelControles(pd), BorderLayout.WEST); //agregamos el panel controles en el oeste de la ventana
			this.add(gs);
			this.pack();
			this.setVisible(true);
			
		}


	
}
