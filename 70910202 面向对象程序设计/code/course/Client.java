import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.print("input student count:");
        Scanner sc = new Scanner(System.in);
        int studentno = sc.nextInt();
        Student[] students = new Student[studentno];
        for(int i=0;i<studentno;i++) {
            students[i] = new Student();              // important important important
            System.out.print("input no " + (i+1) + " student name:");
            String name = sc.next();
            students[i].setName(name);
            System.out.print("input no " + (i+1) + " student grade:");
            int grade = sc.nextInt();
            students[i].setGrade(grade);
            System.out.print("input no " + (i+1) + " student course count:");
            int coursecount = sc.nextInt();
            Course[] courses = new Course[coursecount];
            students[i].setCourses(courses);
            for (int j=0;j<coursecount;j++) {
                System.out.print("input no " + (j+1) + " course name:");
                String coursename = sc.next();
                System.out.print("input no " + (j+1) + " course hour:");
                int coursehour = sc.nextInt();
                courses[j] = new Course();
                courses[j].setCourseHour(coursehour);
                courses[j].setCourseName(coursename);
            }
        }
        sc.close();
        for(int i=0;i<studentno;i++) {
            System.out.println("no " + (i+1) + " student information:");
            students[i].showMessage();
            System.out.println();
        }
    }
}
