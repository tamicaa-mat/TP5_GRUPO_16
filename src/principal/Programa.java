package principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;


public class Programa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static DefaultListModel<Peliculas> listModel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listModel = new DefaultListModel<Peliculas>();
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Peliculas");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar");
		mnNewMenu.add(mntmNewMenuItem);
		
	    
	     // aca agregamos un   actionlistener para que se abra la ventana que sirve para gregar una pelicula
			mntmNewMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	VentanaAgregarPelicula ventanaAgregar = new VentanaAgregarPelicula();
	            	ventanaAgregar.setDefaultListModel(listModel);
	                ventanaAgregar.setVisible(true);
	            }
	        });
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaListarPelicula ventanaListar = new VentanaListarPelicula();
				ventanaListar.setVisible(true);
			}
		});
		
		
	
	}
}
