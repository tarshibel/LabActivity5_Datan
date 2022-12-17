package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderGUI() {
        setTitle("Food Ordering System");
        btnOrder.addActionListener(actionEvent -> {
            try{
                double total = 0;

                if (cPizza.isSelected())
                    total += 100;
                if (cBurger.isSelected())
                    total += 80;
                if (cFries.isSelected())
                    total += 60;
                if (cSoftDrinks.isSelected())
                    total += 55;
                if (cTea.isSelected())
                    total += 50;
                if (cSundae.isSelected())
                    total += 40;

                //with discounts

                if (rbNone.isSelected())
                    total = total + 0;
                else if (rb5.isSelected())
                    total -= total * 0.05;
                else if (rb10.isSelected())
                    total -= total * 0.1;
                else if (rb15.isSelected())
                    total -= total * 0.15;

                JOptionPane.showMessageDialog(panel1,"The total price is Php " + String.format("%.2f", total));
            }catch(Exception err){
                JOptionPane.showMessageDialog(null,"Uh oh, something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        });
    }

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(350, 400);
        order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        order.setVisible(true);

    }
}
