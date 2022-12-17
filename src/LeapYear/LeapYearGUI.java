package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JLabel inputYearLabel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        setTitle("Leap Year Checker");

        btnCheckYear.addActionListener( actionEvent -> {

                    int year = Integer.parseInt(tfYear.getText());

                    boolean isLeap = false;

                    if(year % 4 == 0){
                        if(year % 100 == 0){
                            if(year % 400 == 0){
                                isLeap = true;
                            }
                        } else {
                            isLeap = true;
                        }
                    }
                    String message = "Not a leap year";
                    if(isLeap){
                        message = "Leap year";
                    }
                    JOptionPane.showMessageDialog(null, message);

        });


    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.panel1);
        leap.setSize(300, 200);
        leap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leap.setVisible(true);

    }
}
