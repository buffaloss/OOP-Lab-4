
import java.util.Random;

interface studentMainActivity { //the main actions of students

    void attendsClass();
    void listensToTeacher();
    void sleepsDuringClass();
    void passesExam();
    void failsExam();
    void isLate();
    void isAbsent();
    void leavesClass();
}
interface studentExtra { //the extras 

    void getsSick();
    void attendsEvent();
    void eats();
    void getsObservation();
    void getsIntoFight();
    void smokesInBathroom();
    void bathroom();
    void smokeObservation();
    void getsIntoFight1();
    void fileReport();
    void satisfied();
    void complain();
}

//Student will have name, ID, grade (from 1 to 12) and presence(absent or present) which can be modified
public class Student extends Person {
    //private String name;
    //private int ID;
    private int grade;
    private String presence;
    Random random = new Random();

    public String exist() {
        String existence = "*exists*";
        return existence;
    }

    public String doSomething() {
        String action = "*studies*";
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
     
    //from interfaces
    public void attendsClass() {
        System.out.println(getName()+ ": I am "+ getPresence());
    }

    public void listensToTeacher() {
        System.out.println(getName()+ ": *attentinvely and quiestly listens* ");
    }

    public void sleepsDuringClass() {
        System.out.println(getName()+ ": *zzzzZZZZZZ zzZZZzZZzzZZ*");
    }

    public void passesExam() {
        System.out.println(getName()+ ": Yay! Thank God I passed! ");
    }

    public void failsExam() {
        System.out.println(getName()+ ": NO WAYYYY...  *sad and angry face full of hatred for the world* ");
    }

    public void isLate() {
        System.out.println(getName()+ ": Sorry for being late ma'am  ");
    }

    public void isAbsent() {
        System.out.println(getName()+ ": I am " + getPresence());
    }

    public void getsSick() {
        System.out.println(getName()+ ": I don't feel well... ");
    }

    public void attendsEvent() {
        System.out.println(getName()+ ": Ugh, this event is so boring ");
    }

    public void eats() {
        System.out.println(getName()+ ": I'm so hungry i could eat everything on this table right now ");
    }

    public void getsObservation() {
        int option = random.nextInt(1,4);
        if (option == 1) {
        System.out.println(getName()+ ": Sorry ma'am... ");}
        else if (option == 2) { System.out.println(getName()+ ": Stop nagging me! ");}
        else {        System.out.println(getName()+ ": *continues sleeping* ");}
    }


    public void getsIntoFight() {
        System.out.println(getName()+ ": What did you justs say to me?! * starts throwing punches* ");
    }

    public void smokesInBathroom() {
        System.out.println(getName()+ ": Ah, thank god i can smoke at least until the break is over.. ");
    }

    public void leavesClass() {
        System.out.println(getName()+ ": *leaves classroom* ");

    }

    public void bathroom() {
        System.out.println(getName()+ ": *enters bathroom* ");

    }

    public void smokeObservation() {
        System.out.println(getName()+ ": I don't think you should be smoking here. At least wait until classes are over,dude. ");


    }

    public void getsIntoFight1() {
        System.out.println(getName()+ ": I said what I said. Stop being so whiny and wait until classes are over.  ");

    }

    public void fileReport() {
        System.out.println(getName()+ ": *files report on the nurse who neglected her duties* ");
    }

    public void satisfied() {
        System.out.println(getName()+ ": *no complaints* ");

    }

    public void complain() {
        System.out.println(getName()+ ": Ah really.. *disappointed* ");

    }

}