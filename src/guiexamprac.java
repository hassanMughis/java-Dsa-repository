import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
public class guiexamprac {
    private JLabel title;
    private JLabel firstnum;
    private JLabel secondnum;
    private JLabel resultLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton addbutton;
    private JButton substractbutton;
    private JButton clearbutton;
    private JButton multiplybutton;
    private JButton dividebutton;
    private JButton exitbutton;
    private JPanel Simplecalculator;

    public static void main(String[] args) {
        JFrame frame = new JFrame("guiexamprac");
        frame.setContentPane(new guiexamprac().Simplecalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public guiexamprac() {
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();

                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);

                int sum = number1 + number2;

                textField3.setText(Integer.toString(sum));
            }
        });
        substractbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();

                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);

                int difference = number1 - number2;

                textField3.setText(Integer.toString(difference));
            }
        });
        clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();

                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);

                int product = number1 * number2;

                textField3.setText(Integer.toString(product));
            }
        });
        dividebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                int number1 = Integer.parseInt(text1);
                int number2 = Integer.parseInt(text2);
                if (number2 != 0) {
                    int division = number1 / number2;
                    textField3.setText(Integer.toString(division));
                } else {
                    textField3.setText("Cannot divide by zero");
                }
            }
        });

        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}

