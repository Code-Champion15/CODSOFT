import java.util.*;
public class courselisting{
    private ArrayList<courseDB> courses;
    private ArrayList<studentDB> students;

    public ArrayList<studentDB> getStudents(){
        return students;
    }

    public ArrayList<courseDB> getCoures(){
        return courses;
    }

    public courselisting(){
        this.courses=new ArrayList<>();
        this.students=new ArrayList<>();
    }
    public void addcourse(courseDB course){
        courses.add(course);
    }
    public void addstudent(studentDB student){
        students.add(student);
    }
    public void displaycourses(){
        System.out.println("here is course listing");
        for (courseDB course : courses){
            System.out.println("code="+course.getCode()+";title="+course.getTitle()+"; description="+course.getDescription()+" capacity="+course.getCapacity()+";schedule="+course.getSchedule()+" ;available slots="+course.getAvailableslots());
        }

    }
}