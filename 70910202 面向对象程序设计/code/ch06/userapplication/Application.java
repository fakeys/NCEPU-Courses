import java.util.Scanner;

public class Application {
    private UserDao userDao;
    Scanner sc = new Scanner(System.in);
    public Application(){
    }
    public Application(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void registe() {
        System.out.println("******registe******");
        String username = sc.next();
        String password = sc.next();
        String confirmword = sc.next();
        User user = new User();
        if (!(password.equals(confirmword)))
        System.out.println("passwords not equal!");
        else {
            user.setUserName(username);
            user.setPassword(password);
            if (userDao.addUser(user))
                System.out.println(user.getUserName() + ",registe success!");
            else
                System.out.println(user.getUserName() + ",registe fail!");
        }
    }
    public void login() {
        System.out.println("******login******");
        String username = sc.next();
        String password = sc.next();
        User user = userDao.getUser(username, password);
        if (user != null)
            System.out.println(username + ",login success!");
        else
            System.out.print(username + ",login fail!");
        sc.close();
    }
}
