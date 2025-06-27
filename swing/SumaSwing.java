package ar.edu.uade;


import javax.swing.*;
import java.awt.*;

public class SumaSwing extends JFrame {


    public static void main(String[] args) {
        new SumaSwing();
    }

    public SumaSwing() {
        setTitle("Suma de dos números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);
        JButton btSumar = new JButton("Sumar");
        JButton btnBorrar = new JButton("Borrar");
        JLabel lbResultado = new JLabel("Resultado:");

        add(new JLabel("Número:"));
        add(campo1);
        add(new JLabel("Número 2:"));
        add(campo2);
        add(btSumar);
        add(btnBorrar);
        add(lbResultado);

        btSumar.addActionListener(e -> {

            try {

                int n1 = Integer.parseInt(campo1.getText());
                int n2 = Integer.parseInt(campo2.getText());
                lbResultado.setText("Resultado: " + (n1 + n2));
            } catch (NumberFormatException ex) {

                lbResultado.setText("Ha ocurrido un error en la entrada");
            }

        });

        setSize(250, 150);
        setVisible(true);





    }

}
