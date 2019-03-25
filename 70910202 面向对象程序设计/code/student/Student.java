public class Student {
    private String credit;
    private String name;
    private char gender;
    private int age;

    public Student() {}
    public Student(String credit, String name, char gender, int age) {
        this.age = age;
        this.credit = credit;
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCredit() { return credit; }
    public void setCredit(String credit) { this.credit = credit; }
    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String toString() {
        return this.credit+","+this.name+","+this.gender+","+this.age;
    }
}

