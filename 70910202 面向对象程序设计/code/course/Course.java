public class Course {
    private String courseName;
    private int courseHour;

    public Course() {}
    public Course(String courseName, int coursehHour) {
        this.courseHour = coursehHour;
        this.courseName = courseName;
    }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setCourseHour(int courseHour) { this.courseHour = courseHour; }
    public String getCourseName() { return courseName; }
    public int getCourseHour() { return  courseHour; }
}
