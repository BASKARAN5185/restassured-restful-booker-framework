package payloads;

public class Auth {
    private String username;
    private String password;

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasssword() {
        return password;
    }
}
