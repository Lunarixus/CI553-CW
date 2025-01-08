package clients.login;

import javax.swing.*;
import java.awt.*;

/**
 * The {@code LoginView} class represents the login GUI for the application.
 * It provides fields for username and password input, along with a login button.
 */
public class LoginView extends JFrame {
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final LoginModel loginModel;

    /**
     * Constructs a new {@code LoginView} with the specified login model.
     *
     * @param loginModel the {@link LoginModel} used to verify login credentials
     */
    public LoginView(LoginModel loginModel) {
        super("Login");
        this.loginModel = loginModel;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(new JLabel("")); // Padding to the bottom right
        panel.add(new JLabel(""));
        panel.add(loginButton);

        // Add action listener for the login button
        loginButton.addActionListener(e -> handleLogin());

        // Set the login button as the default button for the root pane
        getRootPane().setDefaultButton(loginButton);

        add(panel);
        setSize(300, 150);
        setLocationRelativeTo(null);
    }

    /**
     * Handles the login process when the login button is clicked
     * or the "Enter" key is pressed.
     * <p>
     * Compares user input with hardcoded credentials. If the credentials match,
     * the login is marked as successful. Otherwise, an error message is displayed.
     */
    private void handleLogin() {
        // Example hardcoded credentials
        String username = "username";
        String password = "password";

        String usernameVal = usernameField.getText().trim();
        String passwordVal = new String(passwordField.getPassword()).trim();

        if (usernameVal.isEmpty() || passwordVal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Both fields must be filled.");
            return;
        }

        if (username.equals(usernameVal) && password.equals(passwordVal)) {
            loginModel.setLoginSuccessful(true);
            dispose(); // Close the login window on successful login
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Try again.");
        }
    }
}
