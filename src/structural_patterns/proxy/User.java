package structural_patterns.proxy;

public class User {

    private String login;
    private String password;
    private boolean subscriptionAvailability;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.subscriptionAvailability = false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscriptionAvailability() {
        return subscriptionAvailability;
    }

    public void setSubscriptionAvailability(boolean subscriptionAvailability) {
        this.subscriptionAvailability = subscriptionAvailability;
    }
}
