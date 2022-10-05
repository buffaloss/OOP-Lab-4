//Teacher will have name,ID,subject(Physical Education, Maths, English language, Physics, History, etc), and salary which can be mdofied
public class Teacher {
    private String name;
    private int ID;
    private String subject;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID ;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     //modify teacher's salary by adding or subtracting from current salary
     public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }
}