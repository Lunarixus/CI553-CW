package clients.login;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The {@code LoginModel} class represents the model for managing the state of a login operation.
 * It uses an {@link AtomicBoolean} to ensure thread-safe updates to the login state.
 */
public class LoginModel {
    private final AtomicBoolean loginSuccessful = new AtomicBoolean(false);

    /**
     * Returns whether the login operation was successful.
     *
     * @return {@code true} if the login was successful, {@code false} otherwise
     */
    public boolean isLoginSuccessful() {
        return loginSuccessful.get();
    }

    /**
     * Sets the state of the login operation.
     *
     * @param value {@code true} to indicate a successful login, {@code false} otherwise
     */
    public void setLoginSuccessful(boolean value) {
        loginSuccessful.set(value);
    }
}
