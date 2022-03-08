package sv.edu.udb.ejerciciopoo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class registroCelular {

	private JFrame frame;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtTamanioPantalla;
	private JTextField txtColor;
	private JTextField txtCantidadCamaras;
	private JTextField txtCosto;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroCelular window = new registroCelular();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registroCelular() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Programa de registro de celulares");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 20, 416, 13);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(20, 43, 143, 13);
		frame.getContentPane().add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(173, 40, 211, 19);
		frame.getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(20, 66, 145, 13);
		frame.getContentPane().add(lblModelo);
		
		JLabel lblTamanioPantalla = new JLabel("Tama\u00F1o de pantalla");
		lblTamanioPantalla.setBounds(20, 89, 145, 13);
		frame.getContentPane().add(lblTamanioPantalla);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(20, 112, 145, 13);
		frame.getContentPane().add(lblColor);
		
		JLabel lblCantidadCamaras = new JLabel("Cantidad de camaras");
		lblCantidadCamaras.setBounds(20, 135, 145, 13);
		frame.getContentPane().add(lblCantidadCamaras);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(20, 158, 145, 13);
		frame.getContentPane().add(lblCosto);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(20, 181, 145, 13);
		frame.getContentPane().add(lblPrecio);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(173, 63, 211, 19);
		frame.getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtTamanioPantalla = new JTextField();
		txtTamanioPantalla.setBounds(173, 86, 211, 19);
		frame.getContentPane().add(txtTamanioPantalla);
		txtTamanioPantalla.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setBounds(173, 109, 211, 19);
		frame.getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		txtCantidadCamaras = new JTextField();
		txtCantidadCamaras.setBounds(173, 132, 211, 19);
		frame.getContentPane().add(txtCantidadCamaras);
		txtCantidadCamaras.setColumns(10);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(173, 155, 211, 19);
		frame.getContentPane().add(txtCosto);
		txtCosto.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(173, 178, 211, 19);
		frame.getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
	}
}
