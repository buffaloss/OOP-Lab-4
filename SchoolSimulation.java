import java.util.Scanner;
import java.util.Random;

public class SchoolSimulation{

    public static void main(String[] args) {
        
        
        //create a new school object
        School sch = new School();
        sch.setName("Lyceum of Modern Languages and Management");
        sch.setSurface(5120);
        sch.setAnnualFunds(70000);

  
        //example of overriding attribute
        /*Staff example = new Staff();
        System.out.println("Value of a1 in Staff parent class: " + example.a1);
        AuxiliaryWorker example1 = new AuxiliaryWorker();
        System.out.println("Value of a1 in AuxiliaryWorker child class of Staff: "+example1.a1);
        System.out.println();
        */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Teacher t = new Teacher();
        t.setID(23);
        t.setName("Maria Ghita");
        t.setSubject("Physical Education");
        t.setSalary(1200);

        Parent p = new Parent();
        p.setName("Giana Romanovschi");
        
        Student s = new Student();
        s.setID(97);
        s.setName("Cristina Dudnic");
        s.setGrade(11);
        s.setPresence("present");

        Student s1 = new Student();
        s.setID(56);
        s.setName("Dan Chitic");
        s.setGrade(10);
        s.setPresence("present");

        Adjunct a = new Adjunct();
        a.setID(44);
        a.setName("Lucia Rabei");
        a.setTask("Organize prent-teacher meeting ");
        a.setSalary(2100);

        AuxiliaryWorker auxw = new AuxiliaryWorker();
        auxw.setID(12);
        auxw.setJob("Janitor");
        auxw.setName("John Smith");
        auxw.setSalary(780);

        AuxiliaryWorker auxw1 = new AuxiliaryWorker();
        auxw1.setID(55);
        auxw1.setJob("Nurse");
        auxw1.setName("Irina Arnadie");
        auxw1.setSalary(1000);

        AuxiliaryWorker aw = new AuxiliaryWorker();
        aw.setID(76);
        aw.setJob("Cook");
        aw.setName("Arcadie Manolie");
        aw.setSalary(950);
       
        Curriculum c = new Curriculum("");

        School.Location loc = new School.Location();
        loc.setCity("Chisinau");
        loc.setAddress("Petru Rares 39");

        int choice;
 
        do {
            System.out.println();
            System.out.println("    CHOOSE YOUR SCENARIO:    ");
            System.out.println("1. Sleeping during class ");
            System.out.println("2. Parent-teacher meeting ");
            System.out.println("3. Occupied classroom ");
            System.out.println("4. Student fight ");
            System.out.println("5. The school nurse ");
            System.out.println("6. The school kitchen ");
            System.out.println("7. View school subjects ");
            System.out.println("8. Exit program");
            System.out.println();
            System.out.println(" Enter your choice: ");
            choice = scan.nextInt();
            switch(choice){
                case 1: 
                        System.out.println();
                        s.attendsClass();
                        t.teaches();
                        s.sleepsDuringClass();
                        t.givesObservation();
                        s.getsObservation();
                        s.leavesClass();
                        System.out.println();
                        break;
                case 2:
                       System.out.println();
                       a.organizeMeeting();
                       p.entersMeetingRoom();
                       t.entersMeetingRoom();
                       t.parentMeeting();
                       int option = random.nextInt(1,4);
                       int opt = random.nextInt(1,3);
                         if (option == 1) {
                             System.out.println(p.getName()+ ": I see, I didnt't know about that...I will make sure to talk to him/her at home. Thank you for letting me know. ");
                             p.leaveMeeting();
                            }
                         else if (option == 2) {
                            System.out.println(p.getName()+ ": Ah, they're children.. It is no nothing serious! ");
                            p.leaveMeeting();
                         }
                         else {
                            System.out.println(p.getName()+ ": What did you just say about my children?! I want to to talk to your superior about this! *Karen noises*");
                            if (opt == 1) {
                            t.argueParent();
                            a.fireStaff();
                            }
                            else {t.calmParent();} 
                        }
                       System.out.println();
                        break;
                case 3:
                      System.out.println();
                      t.tryClassrom();
                      auxw.clean();
                      t.tryClassrom();
                      int opt1 = random.nextInt(1,3);
                      if (opt1 ==1) {
                        auxw.clean();
                        t.tryClassrom();
                        auxw.freeClassroom();
                      }
                      else {
                        auxw.freeClassroom();
                      }
                      int opt2 = random.nextInt(1,3);
                      if (opt2 ==1 ){
                        a.observeClass();
                        t.teaches();
                      }
                      else {
                        t.teaches();
                      }
                      t.endsClass();
                      a.giveFeedback();
                      t.hurryMeeting();
                      t.teacherMeeting();
                      System.out.println();
                      break;
                case 4:
                        System.out.println();
                        s.attendsClass();
                        t.teaches();
                        s.listensToTeacher();
                        t.endsClass();
                        s.eats();
                        s.bathroom();
                        s.smokesInBathroom();
                        s1.smokeObservation();
                        s.getsIntoFight();
                        s1.getsIntoFight1();
                        t.stopsFight();
                        a.organizeMeeting();
                        p.entersMeetingRoom();
                        int option1 = random.nextInt(1,3);
                        if (option1 ==1 ) {
                            a.exmatriculation1();
                        }
                        else {
                            a.punishment1();
                        }
                        int option2 = random.nextInt(1,4);
                        if (option2 ==1 ) {
                            a.exmatriculation2();
                        }
                        else if (option2 == 2){
                            a.punishment2();
                        }
                        else {
                            a.noPunishment();
                        }
                        System.out.println();
                        break;
                case 5:
                            System.out.println();
                             a.hireStaff();
                             auxw1.enterSchool();
                             s1.attendsClass();
                             s1.eats();
                             s1.listensToTeacher();
                             s1.leavesClass();
                             s1.getsSick();
                             int opt3 = random.nextInt(1,5);
                             if (opt3 == 1) {
                                auxw1.treat();
                                auxw1.callAmbulance();
                                t.callParent();
                             }
                             else if (opt3 == 2) {
                                auxw1.treat();
                                auxw1.sendHome();
                             }
                             else if (opt3 == 3) {
                                auxw1.treat();
                                auxw1.sendToClass();
                             }
                             else {auxw1.ignoreStudent();
                                s1.fileReport();
                                a.organizeMeeting();
                                int opt4 = random.nextInt(1,3);
                                if (opt4 == 1) {
                                    a.fireStaff();
                                }
                                else { a.salaryCut();}
                            }
                            System.out.println();
                            break;


                case 6:
                            System.out.println();
                            aw.enterSchool();
                            aw.cook();
                            int opt5 = random.nextInt(1,4);
                            if (opt5 ==1){
                                aw.serveFood();
                                s.eats();
                                s.satisfied();
                                
                            }
                            else if (opt5 == 2) {
                                aw.runOutOfIngredients();
                                aw.makeSmallerPortions();
                                aw.serveFood();
                                s.eats();
                                int opt6 = random.nextInt(1,3);
                                if (opt6 == 1){
                                    s.satisfied();
                                    ;
                                }
                                else {
                                    s.complain();
                                  
                                }
                                aw.sad();
                            }
                            else if (opt5 == 3){
                                aw.burnFood();
                                aw.noFoodAnnouncement();
                                s.complain();
                                aw.sad();
                                
                            }
                           System.out.println();    
                           break;

                            
                case 7:
                  c.outputSubjects();
                  break;

                case 8:
                  break;
                default:
                        System.out.println("Invalid choice. ");
                        break;
            } 
        } while (choice != 8);
    }

}