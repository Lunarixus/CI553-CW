package clients.login;

import java.util.concurrent.atomic.AtomicBoolean;

public class LoginModel {
    private AtomicBoolean loginSuccessful = new AtomicBoolean(false);

    public boolean isLoginSuccessful() {
        return loginSuccessful.get();
    }

    public void setLoginSuccessful(boolean value) {
        loginSuccessful.set(value);
    }
}
