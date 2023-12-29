public class courseBD{
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private int availableslots;
    
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public void setTitle(String title){
        this.code=code;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return code;
    }
    public void setSchedule(String schedule){
        this.schedule=schedule;
    }
    public String getSchedule(){
        return schedule;
    }
    public void setAvailableslots(int availableslots){
        this.availableslots=availableslots;
    }
    public int getAvailableslots(){
        return availebleslots;
    }

    public courseBD(String code,String title,String description,int capacity,String schedule){
        this.code=code;
        this.title=title;
        this.description=description;
        this.capacity=capacity;
        this.availableSlots=capacity;
    }

    public void incrementAvailableslots(){
        if(availableslots<capacity){
            availableslots=availableslots+1;
        }
    }

    public void decrementAvailableslots(){
        if(availableslots>0){
            availableslots=availableslots-1;
        }
    }





}