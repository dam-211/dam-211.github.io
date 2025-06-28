import javax.swing.*;
import java.awt.*;

public class LoanView extends JFrame {

    private final JTextField amountField = new JTextField(10);
    private final JTextField rateField = new JTextField(10);
    private final JTextField monthsField = new JTextField(10);
    private final JLabel resultLabel = new JLabel(" ");

    public LoanView(){
        setTitle("Calculadora Hipotecaria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Monto:")); add(amountField);
        add(new JLabel("Tasa anual(%):")); add(rateField);
        add(new JLabel("Meses:")); add(monthsField);

        JButton calcularBtn = new JButton("Calcular");
        add(calcularBtn); add(resultLabel);

        calcularBtn.addActionListener(e -> {

            try{
                double monto = Double.parseDouble(amountField.getText());
                double tasa = Double.parseDouble(rateField.getText());
                int meses = Integer.parseInt(monthsField.getText());

                //TBD voy a llamar al controller

            }catch(NumberFormatException ex){
                resultLabel.setText("Datos invalidos");
            }
        });

        pack();
        setVisible(true);

    }


}
