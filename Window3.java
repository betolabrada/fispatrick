import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window3 extends JFrame{
		public Window3(GUIShow gss) {
			super("Parkinglot");
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(pantalla.width / 2,0);
			//this.setSize(800 , 600); //(width , heigth)
			//agregar un panelDibujo al contenedor de la ventana
			//this.add(new PanelControles(pd), BorderLayout.WEST); //agregamos el panel controles en el oeste de la ventana
			this.add(gss);
			this.pack();
			this.setVisible(true);
			
		}
}
