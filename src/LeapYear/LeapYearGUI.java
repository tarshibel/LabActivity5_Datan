package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(new LeapYearGUI().panel1);
        leap.setSize(300, 200);
        leap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leap.setVisible(true);

    }
}
