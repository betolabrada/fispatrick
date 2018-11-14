import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIShow extends JPanel{
	private ParkingLot pl;
	private JButton btGenerate;
	private JTextField tfNumTicket;
	double price;

	public GUIShow(ParkingLot pl) {
		super();
		this.pl = pl;
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension (pantalla.width / 2, pantalla.height));
		this.btGenerate = new JButton("Generar precio");
		this.tfNumTicket = new JTextField("0");
		this.setLayout(null);
		this.btGenerate.setBounds(200,130, 200, 100);
		this.tfNumTicket.setBounds(200,260, 200, 40);
		this.add(this.btGenerate);
		this.add(this.tfNumTicket);
		
		this.btGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = 0;
					if(tfNumTicket.getText()!=null) {
						price = pl.calculatePrice(Integer.parseInt(tfNumTicket.getText()));
						pl.deleteCar(Integer.parseInt(tfNumTicket.getText()));
					}
			}
		});
		
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.gray);
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.WHITE);
		g.fillRect(30, 60, 250, 30);
		g.fillRect(30, 130, 115, 30);
		g.fillRect(30, 200, 115, 30);
		g.fillRect(30, 270, 115, 30);
		
		g.setColor(Color.black);
		g.drawString("Numero de carros: ", 30, 50);
		g.drawString(""+pl.getNumCarros(), 35, 80);
		g.drawString("Lugares disponibles: ", 30, 120);
		g.drawString(""+pl.getLugaresDisponibles(), 35, 150);
		g.drawString("Ganancia: ", 30, 190);
		g.drawString(""+pl.getIncome(), 35, 220);
		g.drawString("Precio: ", 30, 260);
		g.drawString("$ "+this.price, 35, 290);
		//g.drawString(""+pl.getTime(), 800, 50);
		repaint();
		
		
	}
}
