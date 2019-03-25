public class User {
    private String userName;
    private String password;

    public User() {
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
