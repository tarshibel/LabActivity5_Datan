package SimpleCalc;

import javax.swing.*;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox<String> cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;

    public SimpleCalcGUI(){
        setTitle("Simple Calculator");
        btnCompute.addActionListener( actionEvent -> {
            try{
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double res = 0;

                String op = (String) cbOperations.getSelectedItem();

                switch(Objects.requireNonNull(op)) {
                    case "+" -> res = num1 + num2;
                    case "-" -> res = num1 - num2;
                    case "*" -> res = num1 * num2;
                    case "/" -> res = num1 / num2;
                }

                lblResult.setText(Double.toString(res));
            } catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(SimpleCalcGUI.this, "Arithmetic overflow or division by zero has occurred.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException er) {
                JOptionPane.showMessageDialog(null, "Invalid or Empty Inputs", "Error", JOptionPane.ERROR_MESSAGE);
            }

        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(450, 250);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

}
