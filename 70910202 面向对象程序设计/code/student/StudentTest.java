public class StudentTest {
    public static void main(String[] args) {
        Student dog = new Student("007","Bang",'m',40);
        Student cat = new Student("009","Rose",'f',41);
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println("Student Count: "+2);
        Student student[] = new Student[2];
        student[0] = new Student("007","Bang",'m',40);
        student[1] = new Student("009","Rose",'f',41);
        System.out.println(student[0].toString());
        System.out.println(student[1].toString());
        System.out.println("Student Count: "+student.length);
    }
}
