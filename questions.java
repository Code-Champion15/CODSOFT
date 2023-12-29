import java.util.*;
public class questions{
    protected String qst;
    ArrayList<String> choix;
    protected int repcorrecte;

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

    
    questions(String qst,ArrayList<String> choix,int repcorrecte){
        this.qst=qst;
        this.choix=choix;
        this.repcorrecte=repcorrecte;
    }
}

