import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class TablaUsuarios extends JFrame {


    public static void main(String[] args) {
        new TablaUsuarios();
    }

    public TablaUsuarios() {
        setTitle("Tabla de usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField txtNombre = new JTextField();
        JTextField txtMail = new JTextField();
        JButton btnGuardar = new JButton("Guardar");

        txtNombre.setBounds(10, 10, 120, 25);
        txtMail.setBounds(140, 10, 120, 25);
        btnGuardar.setBounds(270, 10, 100, 25);
        add(txtNombre);add(txtMail);add(btnGuardar);

        String columnas[] = {"Nombre", "Email"};

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable table = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(10, 50, 360, 200);
        add(scrollPane);

        btnGuardar.addActionListener( e -> {

            if(txtNombre.getText().isEmpty() || txtMail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del usuario");
            }else{
                modelo.addRow(new Object[]{txtNombre.getText(), txtMail.getText()});
                txtNombre.setText("");
                txtMail.setText("");
            }
        });

        setVisible(true);
    }

}
