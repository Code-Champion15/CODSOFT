public class mainregistrationsystem{
    public static void main(String args[]){
        courselisting registrationsystem = new courselisting();
        courseDB javaCourse = new courseDB("jjj","java introduction","basics of java and the notion of oriented object",20,"Monday tuesday 10:00AM");
        courseDB python = new courseDB("ppp","intro python","python for begginner",30,"wednesday friday 2:30PM");
        studentDB student1 = new studentDB(1,"yasmine alaya");
        studentDB student2 = new studentDB(2,"sara cherif");
        registrationsystem.addcourse(javaCourse);
        registrationsystem.addcourse(javaCourse);
        registrationsystem.addstudent(student1);
        registrationsystem.addstudent(student2);
        registrationsystem.displaycourses();
        student1.registercourse(python);
        student2.registercourse(javaCourse);
        registrationsystem.displaycourses();
        student2.dropcourse(javaCourse);
        registrationsystem.displaycourses();
    }
}