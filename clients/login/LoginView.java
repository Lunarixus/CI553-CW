package clients.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private LoginModel loginModel;

    public LoginView(LoginModel loginModel) {
        super("Login");
        this.loginModel = loginModel;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        add(panel);
        setSize(300, 150);
        setLocationRelativeTo(null);
    }

    private void handleLogin() {
        // Change these details, these are defaults.
        String username = "username";
        String password = "password";

        String username_val = usernameField.getText();
        String password_val = new String(passwordField.getPassword());

        if (username.equals(username_val) && password.equals(password_val)) {
            loginModel.setLoginSuccessful(true);
            dispose(); // Close the login window on successful login
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Try again.");
        }
    }
}
