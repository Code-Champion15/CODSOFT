import java.util.*;

public class quiz{
    ArrayList<questions> qst;
    private int score;
    private int indicecurrentqst ; //current questio, index

    public void setScore(int score){
        this.score=score;
    }
    
    public int getScore(){
        return score;
    }

    public void setIndicecurrentqst(int indicecurrentqst){
        this.indicecurrentqst=indicecurrentqst;
    }
    
    public String getIndicecurrentqst(){
        return indicecurrentqst;
    }

    public quiz(ArrayList<questions> qst ){
        this.qst=qst;
        this.score=0;
        this.indicecurrentqst=0;
    }
    void displayquestion(){
        questions questions = qst.get(indicecurrentqst);
        System.out.println(question.question);
        for(int i=0;i<questions.choix.size();i++){
            System.out.println((i+1)+"."+questions.choix.get(i));

        }
    }
    void submitAnswer(int userrep){
        questions questions = qst.get(indicecurrentqst);
        if (userrep==questions.repcorrecte){
            score++;
        }
    }
    void displayresult(){
        System.out.println("terminee");
        System.out.println("ton score final est:"+score);
        System.out.println("recap:");
        for(int i = 0; i<qst.size();i++){
            questions questions = qst.get(i);
            String status;
             if(questions.repcorrecte==questions.userrep){
                status="correcte";

             }else{
                status="incorrecte";
             }
             System.out.println((i+1)+"."+status);
        }
    }
}