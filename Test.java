import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    Container c;
    JTextField nameField;
    JPasswordField passwordField;
    JTextField phonTextField;

    Test() {
        // window
        setTitle("My APP");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 450);
        c = getContentPane();
        c.setBackground(Color.black);
        setResizable(false);
        c.setLayout(null);
        Font font = new Font("Arial", Font.BOLD, 12);

        // name field label & infput field
        JLabel nameLabel = new JLabel("User Name: ");
        nameLabel.setBounds(20, 30, 100, 30);
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(font);

        c.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(20, 60, 260, 30);
        nameField.setForeground(Color.blue);
        nameField.setEditable(true);
        c.add(nameField);

        // email field label & infput field
        JLabel emaiLabel = new JLabel("Email: ");
        emaiLabel.setForeground(Color.white);
        emaiLabel.setBounds(20, 90, 100, 30);
        emaiLabel.setFont(font);
        c.add(emaiLabel);

        nameField = new JTextField();
        nameField.setBounds(20, 120, 260, 30);
        nameField.setForeground(Color.blue);
        nameField.setEditable(true);
        c.add(nameField);

        // password field label & infput field
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setForeground(Color.white);
        passwordLabel.setBounds(20, 150, 100, 30);
        passwordLabel.setFont(font);
        c.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(20, 180, 260, 30);
        c.add(passwordField);

        // repassword field label & infput field
        JLabel phonLabel = new JLabel("Phone Number: ");
        phonLabel.setForeground(Color.white);
        phonLabel.setBounds(20, 210, 100, 30);
        phonLabel.setFont(font);
        c.add(phonLabel);

        phonTextField = new JTextField();
        phonTextField.setBounds(20, 240, 260, 30);
        phonTextField.setForeground(Color.blue);
        phonTextField.setEditable(true);
        c.add(phonTextField);

        // coursor
        JButton btn = new JButton("Submit");
        btn.setBounds(20, 280, 100, 30);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btn.setBackground(Color.blue);
        btn.setForeground(Color.white);
        btn.setCursor(cursor);
        btn.setEnabled(true);
        c.add(btn);

        // coursor
        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(160, 280, 100, 30);
        Cursor cursorClear = new Cursor(Cursor.HAND_CURSOR);
        btnClear.setCursor(cursorClear);
        btnClear.setEnabled(true);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                passwordField.setText("");
                phonTextField.setText("");
            }

        });
        c.add(btnClear);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
