package ar.edu.uade;


import javax.swing.*;

public class HolaMundoSwing extends JFrame {


    public static void main(String[] args) {
        new HolaMundoSwing();
    }

    public HolaMundoSwing() {
        setTitle("Hola MundoSwing");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //Layout absoluto

        JLabel etiqueta = new JLabel("Cargando...");
        etiqueta.setBounds(100, 20, 100, 25);
        add(etiqueta);

        JButton boton = new JButton("Boton");
        boton.setBounds(90, 60, 120, 30);
        add(boton);

        boton.addActionListener(
                e -> etiqueta.setText("Ha sido cambiado")
        );

        setVisible(true);

    }

}

