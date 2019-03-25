
public class Test {
    public static void main(String args[]) {
        Application app = new Application();
        UserDao userDao = new UserDaoForArray();
        app.setUserDao(userDao);
        app.registe();
        app.registe();
        app.login();
    }
}
