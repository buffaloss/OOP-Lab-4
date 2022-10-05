//auxiliary workes will be: nurse, school psychologist, cook, janitor,etc
public class AuxiliaryWorker extends Staff{
    private String name;
    private int ID;
    private int salary;
    private String job;
    int a1 = 222; //example for overriding

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}