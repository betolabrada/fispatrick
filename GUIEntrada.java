import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIEntrada extends JPanel {
	private JButton btEntrada;
	private JLabel jlEntrada;
	private ParkingLot pl;

	public GUIEntrada(ParkingLot pl) {
		super();
		this.pl = pl;
		this.setPreferredSize(new Dimension (600,600));
		this.btEntrada = new JButton("Entrada");
		this.jlEntrada = new JLabel("Bienvenido, tome su ticket");
		this.jlEntrada.setBounds(50, 100, 200, 100);
		this.btEntrada.setBounds(200, 300, 200, 100);
		
		this.setLayout(null);
		this.add(this.btEntrada);
		this.jlEntrada.setVisible(false);
		this.add(this.jlEntrada);
		
		this.btEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pl.incrementCarros();
				jlEntrada.setVisible(true);
				System.out.println(pl.getNumCarros());
			}
		});
		
		
	}
}
