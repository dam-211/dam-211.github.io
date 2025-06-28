import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConfirmarSalida extends JFrame {


    public static void main(String[] args) {
        new ConfirmarSalida();
    }

    public ConfirmarSalida() {
        setTitle("Cerrar con confirmación");
        setSize(300, 150);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que querés salir?", "Confirmar salida",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });

        add(new JLabel("Cerrá la ventana para ver el mensaje."), SwingConstants.CENTER);
        setVisible(true);
    }

}
