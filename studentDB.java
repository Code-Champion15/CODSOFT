import java.util.ArrayList;
public class studentDB{
    private int id;
    private String name;
    private ArrayList<courseDB> registredcourses;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
public ArrayList<courseDB> getRegistredcourses(){
    return registredcourses;
}
    public studentDB(int id,String name){
        this.id=id;
        this.name=name;
        this.registredcourses= new ArrayList<>();
    }
    public void registercourse(courseDB course){
        if (course.getAvailableslots()>0) {
            registredcourses.add(course);
            course.decrementAvailableslots();
            System.out.println(name+" has registred for:"+course.getTitle());
        }
        else{
            System.out.println("sorry"+course.getTitle()+"is full can t register");
        }
    }
    public void dropcourse(courseDB course){
        if (registredcourses.contains(course)){
            registredcourses.remove(course);
            System.out.println(name+ " has dropped "+course.getTitle());
        }
        else{
            System.out.println(name+"isn t registred for the course "+course.getTitle());
        }
    }
}