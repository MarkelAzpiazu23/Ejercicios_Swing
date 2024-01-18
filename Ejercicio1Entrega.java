import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio1Entrega extends JFrame implements ActionListener {
	
	JLabel lblUsuario;
	JTextField txtPersona;
	JLabel lblSecreto;
	JPasswordField pswContrasenha;
	JButton btnBoton;
	JLabel lblResultado;
	
	Ejercicio1Entrega(){
		
		setLayout(new GridLayout(15,15));
		
		lblUsuario = new JLabel("Usuario:");
		txtPersona = new JTextField("");
		lblSecreto = new JLabel("Contrasena:");
		pswContrasenha = new JPasswordField("");
		btnBoton = new JButton("Validar");
		
		btnBoton.addActionListener(this);
		
		add(lblUsuario);
		add(txtPersona);
		add(lblSecreto);
		add(pswContrasenha);
		add(btnBoton);
		
		setTitle("Iniciar sesion");
		setSize(500,500);
		setVisible (true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==btnBoton) {
				
			String valorUsuario = new String(txtPersona.getText());
			String valorContrasena = new String(pswContrasenha.getPassword());
		
		if(valorUsuario.equals("admin")&& valorContrasena.equals("admin1234"))
			btnBoton.setText("La contraseña es correcta");
		
		else
			btnBoton.setText("La contraseña es incorrecta");
			}

	}

public static void main(String[] args) {
	
	new Ejercicio1Entrega();

}

}
