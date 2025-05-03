package principal;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentanaAgregarPelicula extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textTitulo;
    private JComboBox<Categoria> comboCategoria;
    private JLabel lblIdValor;
    private JPanel contentPane;

    public VentanaAgregarPelicula() {
    	
        setTitle("Programa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);

        contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menu = new JMenuBar();
		menu.setBounds(0, 0, 500, 20);
		getContentPane().add(menu);
		JMenu mnNewMenu = new JMenu("Peliculas");
		menu.add(mnNewMenu);

        JLabel lblId = new JLabel("ID");
        lblId.setBounds(130, 50, 70, 20);
        getContentPane().add(lblId);

        lblIdValor = new JLabel(String.valueOf(Peliculas.obtenerSiguienteId()));
        lblIdValor.setBounds(200, 50, 70, 20);
        getContentPane().add(lblIdValor);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(130, 50 + 35, 70, 20);
        getContentPane().add(lblNombre);

        textTitulo = new JTextField();
        textTitulo.setBounds(200, 50 + 35, 170, 20);
        getContentPane().add(textTitulo);
        textTitulo.setColumns(10);

        JLabel lblGenero = new JLabel("Género");
        lblGenero.setBounds(130, 50 + 35 * 2, 70, 20);
        getContentPane().add(lblGenero);

        comboCategoria = new JComboBox<>(Categoria.values());
        comboCategoria.setBounds(200, 50 + 35 * 2, 170, 20);
        getContentPane().add(comboCategoria);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(180, 50 + 35 * 3 + 10, 120, 30);
        getContentPane().add(btnAceptar);
        
    }
    
}
