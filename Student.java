//Student will have name, ID, grade (from 1 to 12) and presence(absent or present) which can be modified
public class Student extends Person {
    //private String name;
    //private int ID;
    private int grade;
    private String presence;

    public String exist() {
        String existence = "Exists";
        return existence;
    }

    public String doSomething() {
        String action = "Studies";
        return action;
    }

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

    public int getGrade() {
        return grade;
    }

    public void setGrade( int grade){
        this.grade = grade;
    }


    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;

    }

     //modify student's presence if he shows up later 
     public void modifyPresence(String presence) {
        this.presence = presence;
    }
}