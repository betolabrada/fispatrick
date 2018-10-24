import java.awt.Dimension;
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
		this.setPreferredSize(new Dimension (600,600));
		this.btSalida = new JButton("SALIDA");
		this.jlEntrada = new JLabel("Gracias, que tenga buen viaje");
		this.jlEntrada.setBounds(50, 100, 200, 100);
		this.btSalida.setBounds(200, 300, 200, 100);
		
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
