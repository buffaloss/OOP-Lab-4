//adjunct directors will have diff responsabilities
// 1. Hiring staff 2.Organize events 3.Manage contracts/documents ...etc

public class Adjunct extends Staff{ 
    private String name;
    private int ID;
    private String task;
    private int salary;

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

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    //modifiy the task to something else
    public void modifyTask(String task){
        this.task = task;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     //modify adjunct's salary by adding or subtracting from current salary
     public void modifySalary(int salary) {
        this.salary = this.salary+salary;
    }

}