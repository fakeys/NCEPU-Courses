public class UserDaoForArray extends User implements UserDao{
    private User[] data;
    private int count = 0;

    public UserDaoForArray() {
        data = new User[10];
    }
    public boolean addUser(User user) {
        if(count == data.length) {
            return false;
        }
        for(int i=0;i<count;i++) {
            if(data[i].getUserName().equals(user.getUserName())) {
                return false;
            }
        }
        data[count] = user;
        count++;
        return true;
    }

    @Override
    public User getUser(String userName, String password) {
        for(int i=0;i<count;i++) {
            if(data[i].getUserName().equals(userName) && data[i].getPassword().equals(password)) {
                return new User(userName, password);
            }
        }
        return null;
    }
}
