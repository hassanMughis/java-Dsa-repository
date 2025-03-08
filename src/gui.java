import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

public class gui {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250); // Increased size for better appearance

        // Create the panel with BoxLayout for vertical alignment
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement

        // Create components
        JLabel labelNum1 = new JLabel("Number 1:");
        JTextField textNum1 = new JTextField(10);
        labelNum1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text
        textNum1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text

        JLabel labelNum2 = new JLabel("Number 2:");
        JTextField textNum2 = new JTextField(10);
        labelNum2.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text
        textNum2.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text

        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField(10);
        textResult.setEditable(false); // Result should not be editable
        labelResult.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text
        textResult.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align text

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract"); // New Subtract button
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        addButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align button
        subtractButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align button
        clearButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align button
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align button

        // Add components to panel with spacing
        panel.add(Box.createVerticalStrut(10)); // Add spacing
        panel.add(labelNum1);
        panel.add(textNum1);
        panel.add(Box.createVerticalStrut(10)); // Add spacing
        panel.add(labelNum2);
        panel.add(textNum2);
        panel.add(Box.createVerticalStrut(10)); // Add spacing
        panel.add(labelResult);
        panel.add(textResult);
        panel.add(Box.createVerticalStrut(10)); // Add spacing
        panel.add(addButton);
        panel.add(subtractButton); // Add Subtract button
        panel.add(clearButton);
        panel.add(exitButton);
        panel.add(Box.createVerticalStrut(10)); // Add spacing

        // Add action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    double sum = num1 + num2;
                    textResult.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    double difference = num1 - num2;
                    textResult.setText(String.valueOf(difference));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNum1.setText("");
                textNum2.setText("");
                textResult.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        // Add panel to frame
        frame.add(panel);

        // Set frame visible
        frame.setVisible(true);
    }
}