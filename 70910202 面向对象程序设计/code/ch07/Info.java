import java.util.Scanner;

public class Info {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("name(a-zA-Z0-9_)6-8:");
        String name;
        while (true) {
            name = sc.next();
            if (name.matches("[a-zA-Z0-9_]{6,8}"))
                break;
            else {
                System.out.print("error:name(a-zA-Z0-9_)6-8");
                System.out.print("\ninput name:");
            }
        }

        System.out.print("password(a-zA-Z)4-8:");
        String password;
        while (true) {
            password = sc.next();
            if (password.matches("[a-zA-Z]{4,8}"))
                break;
            else {
                System.out.print("password(a-zA-Z)4-8");
                System.out.print("\ninput password:");
            }
        }

        System.out.print("input password again:");
        String confirmword;
        while (true) {
            confirmword = sc.next();
            if (password.equals(confirmword))
                break;
            else {
                System.out.print("passwords not equal!");
                System.out.print("\ninput password again:");
            }
        }

        System.out.print("email:");
        String email;
        while (true) {
            email = sc.next();
            if (email.matches("[a-z0-9]{4,11}@[a-z0-9]{2,5}.com"))
                break;
            else {
                System.out.print("email error!");
                System.out.print("\ninput email:");
            }
        }

        System.out.print("QQ:");
        String qq;
        while (true) {
            qq = sc.next();
            if (qq.matches("[1-9][0-9]{4,11}"))
                break;
            else {
                System.out.print("QQ error!");
                System.out.print("\ninput QQ:");
            }
        }

        System.out.print("birthday(yyyy-MM-dd):");
        String birthday;
        while (true) {
            birthday = sc.next();
            if (birthday.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"))
                break;
            else {
                System.out.print("birthday error!");
                System.out.print("\ninput birthday:");
            }
        }

        System.out.print("phoneNumber:");
        String phoneNumber;
        while (true) {
            phoneNumber = sc.next();
            if (phoneNumber.matches("((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))[0-9]{8}"))
                break;
            else {
                System.out.print("phoneNumber error!");
                System.out.print("\ninput phoneNumber:");
            }
        }

        sc.close();
        String[] birth = birthday.split("-");
        System.out.println("\n\nuser information:\nname:" + name + "\npassword:" + password +
                "\nemail:" + email + "\nQQ:" + qq + "\nbirthday:" + birth[1] + "-" +
                birth[2] + "-" + birth[0] + "\nphoneNumber:" + phoneNumber);
    }
}