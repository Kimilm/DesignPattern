package structural.composite.injava;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200, 200, 200, 40);
        frame.add(jTextField);

        JButton jButton = new JButton("Click");
        jButton.setBounds(200, 100, 80, 40);
        jButton.addActionListener(e -> jTextField.setText("Hello Swing"));
        frame.add(jButton);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
