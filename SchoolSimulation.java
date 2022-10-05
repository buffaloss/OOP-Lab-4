public class SchoolSimulation{

    public static void main(String[] args) {
        //create a new school object
        School sch = new School();
        sch.setName("Lyceum of Modern Languages and Management");
        sch.setSurface(5120);
        sch.setAnnualFunds(70000);
        
        //create location object
        Location l = new Location();
        l.setCity("Chisinau");
        l.setAddress("Petru Rares 39");

        //create a student object
        Student s = new Student();
        s.setName("John Smith");
        s.setPresence("present");
        s.setID(2917374);
        s.setGrade(7);

        //create anotehr student object
        Student s1 = new Student();
        s1.setName("Ioana Braga");
        s1.setPresence("absent");
        s1.setID(8389118);
        s1.setGrade(11);

        //Ioana first was late, then came, so modify presence
        System.out.println();
        System.out.println(s1.getName()+" is currently "+s1.getPresence());
        s1.modifyPresence("present");
        System.out.println(s1.getName()+" is now "+s1.getPresence());
        System.out.println(); //empty line
        //create a teacher object
        Teacher t = new Teacher();
        t.setID(2174388);
        t.setName("Maria Ghita");
        t.setSubject("Physical Education");
        t.setSalary(1200);

        //modify the salary of the teacher
        System.out.println(t.getName()+" had a salary of  "+t.getSalary()+"$ last month.");
        t.modifySalary(1650);
        System.out.println(t.getName()+" currently has a salary of "+t.getSalary()+"$.");
        System.out.println();

        //example of overriding attribute
        Staff example = new Staff();
        System.out.println("Value of a1 in Staff parent class: " + example.a1);
        AuxiliaryWorker example1 = new AuxiliaryWorker();
        System.out.println("Value of a1 in AuxiliaryWorker child class of Staff: "+example1.a1);
        System.out.println();
    }

}