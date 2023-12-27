import java.util.*;
public class questions{
    private String qst;
    ArrayList<String> choix;
    private int repcorrecte;
    private int userrep;

    public void setQst(String qst){
        this.qst=qst;
    }
    
    public String getQst(){
        return qst;
    }

     public void setRepcorrecte(int repcorrecte){
        this.repcorrecte=repcorrecte;
    }
    
    public int getRepcorrecte(){
        return repcorrecte;
    }

    public void setUserrep(int userrep){
        this.userrep=userrep;
    }
    
    public int getUserrep(){
        return userrep;
    }

    questions(String qst,ArrayList<String> choix,int repcorrecte){
        this.qst=qst;
        this.choix=choix;
        this.repcorrecte=repcorrecte;
    }
}