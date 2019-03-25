public class Student {
    private String name;
    private int grade;
    private Course[] courses;

    public Student() {}
    public void setName(String name) { this.name = name; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setCourses(Course[] courses) { this.courses = courses; }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getGrade() {
        return grade;
    }

    public int getHours() {
        int count = 0;
        for (Course d:courses)
            count += d.getCourseHour();
        return count;
    }

    public void showMessage() {
        System.out.println(name + " " + grade + " grade");
        System.out.println("courses:");
        for (int i=0;i<courses.length;i++)
            System.out.println("(" + (i+1) + ")"+courses[i].getCourseName() +
                    ":" + courses[i].getCourseHour() + " hour");
        System.out.println("hours:" + getHours());
    }
}
