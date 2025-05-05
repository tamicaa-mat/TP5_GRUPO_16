package principal;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAgregarPelicula extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textTitulo;
    private JComboBox<Categorias> comboCategoria;
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

        comboCategoria = new JComboBox<Categorias>();
        comboCategoria.setBounds(200, 50 + 35 * 2, 170, 20);
        getContentPane().add(comboCategoria);
        comboCategoria.addItem(new Categorias("Seleccione un genero"));
        comboCategoria.addItem(new Categorias("TERROR"));
        comboCategoria.addItem(new Categorias("ACCION"));
        comboCategoria.addItem(new Categorias("SUSPENSO"));
        comboCategoria.addItem(new Categorias("ROMANTICA"));

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String titulo = textTitulo.getText();
        		if(titulo.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane, 
                        "¡El titulo no puede estar vacio!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
        		 if(comboCategoria.getSelectedIndex() == 0) {
                     JOptionPane.showMessageDialog(contentPane, 
                         "¡Tenes que seleccionar una categoria!", 
                         "Error", 
                         JOptionPane.ERROR_MESSAGE);
                     return;
                 }
        		 Categorias categoriaSeleccionada = (Categorias)comboCategoria.getSelectedItem();
                 JOptionPane.showMessageDialog(contentPane, 
                     "Película añadida:\nTítulo: " + titulo + "\nCategoría: " + categoriaSeleccionada.getNombre(), 
                     "Éxito", 
                     JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        btnAceptar.setBounds(180, 50 + 35 * 3 + 10, 120, 30);
        getContentPane().add(btnAceptar);
        
    }
    
}
