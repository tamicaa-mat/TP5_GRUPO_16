package principal;

import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class VentanaListarPelicula extends JFrame {

    private static final long serialVersionUID = 1L;
    private DefaultListModel<Peliculas> listModel;  
    private JScrollPane scrollPane; 
    private JList<Peliculas> jList; 
    
    public void setDefaultListModel(DefaultListModel<Peliculas> listModel) {
        this.listModel = listModel;
        jList.setModel(this.listModel); 
    }

    public VentanaListarPelicula() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 200, 450, 300); 

        listModel = new DefaultListModel<>();

        jList = new JList<>();
        jList.setFont(new Font("Tahoma", Font.PLAIN, 18));
        scrollPane = new JScrollPane();
		scrollPane.setViewportView(jList);
        add(scrollPane);
    }
}
