import java.awt.Dimension;
import java.awt.Toolkit;
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
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension (pantalla.width / 2, pantalla.height / 2));
		this.btEntrada = new JButton("Entrada");
		this.jlEntrada = new JLabel("Bienvenido, tome su ticket");
		this.jlEntrada.setBounds(50, 100, 200, 100);
		this.btEntrada.setBounds((pantalla.width / 4)-100, (pantalla.height / 4)-50, 200, 100);
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
