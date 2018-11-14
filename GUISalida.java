import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUISalida extends JPanel{
	private JButton btSalida;
	private JLabel jlEntrada;
	private ParkingLot pl;

	public GUISalida(ParkingLot pl) {
		super();
		this.pl = pl;
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension (pantalla.width / 2, pantalla.height / 2));
		this.btSalida = new JButton("Salida");
		this.jlEntrada = new JLabel("Gracias, que tenga buen viaje");
		this.jlEntrada.setBounds(50, 100, 200, 100);
		this.btSalida.setBounds((pantalla.width / 4)-100, (pantalla.height / 4)-50, 200, 100);
		
		this.setLayout(null);
		this.add(this.btSalida);
		this.jlEntrada.setVisible(false);
		this.add(this.jlEntrada);
		
		this.btSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pl.decrementCarros();
				jlEntrada.setVisible(true);
				System.out.println(pl.getNumCarros());
				
			}
		});
		
		
	}
}
