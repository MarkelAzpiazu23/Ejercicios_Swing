import java.awt.FlowLayout;
import java.awt.GridLayout;
//port java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio2Entrega extends JFrame implements ActionListener {
	
	JComboBox cboAnimales;
	String Animales[]= {"gato","perro","caballo"};
	ImageIcon ImgGato,ImgPerro,ImgCaballo;
	JLabel lblImagen;
	
	
	Ejercicio2Entrega(){
		
		setLayout(new FlowLayout());
		
		cboAnimales = new JComboBox(Animales);
		
		cboAnimales.addActionListener(this);
		
		lblImagen = new JLabel();
		ImgGato = new ImageIcon("E:\\imagenes1\\Gato.jpg");
		ImgPerro = new ImageIcon("E:\\imagenes1\\Perro.jpg");
		ImgCaballo = new ImageIcon("E:\\imagenes1\\Caballo.jpg");
		
		add(cboAnimales);
		add(lblImagen);

		setTitle("Animal");
		setSize(500,500);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cboAnimales) {
			
		JOptionPane.showMessageDialog(this,"Seleccionado: "  + cboAnimales.getSelectedItem());
		
		if(cboAnimales.getSelectedItem() == "gato")
			lblImagen.setIcon(ImgGato);
		
		if(cboAnimales.getSelectedItem() == "perro") 
			lblImagen.setIcon(ImgPerro);
		
		if(cboAnimales.getSelectedItem() == "caballo")
			lblImagen.setIcon(ImgCaballo);
		}
		
	}

	public static void main(String[] args) {
	
			new Ejercicio2Entrega();

		}

	}
