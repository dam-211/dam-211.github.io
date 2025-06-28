import javax.swing.*;
import java.awt.*;

public class ComboColores extends JFrame {


    public static void main(String[] args) {
        new ComboColores();
    }

    public ComboColores() {

        setTitle("Combo Colores");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        String colores[] = {"Rojo", "Verde", "Rosa", "Amarelo", "Colorado el 32"};

        JComboBox<String> combo = new JComboBox<>(colores);

        combo.addActionListener(e -> {

            String color = (String) combo.getSelectedItem();

            switch (color) {
                case "Rojo": panel.setBackground(Color.RED);
                break;
                case "Verde": panel.setBackground(Color.ORANGE);
                break;
                case "Rosa": panel.setBackground(Color.GREEN);
                break;
                case "Amarelo": panel.setBackground(Color.YELLOW);
                break;
                case "Colorado el 32": panel.setBackground(Color.CYAN);

            }

        });

        panel.add(combo);
        add(panel);
        setVisible(true);

        




    }

}
