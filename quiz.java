import java.util.*;

public class quiz{
    ArrayList<questions> qst;
    protected int score;
    protected int indicecurrentqst ; //current questio index
    protected int userrep;//the answer of the user

    /*public void setScore(int score){
        this.score=score;
    }

    public int getScore(){
        return score;
    }*/

     public void setUserrep(int userrep){
        this.userrep=userrep;
    }

    public int getUserrep(){
        return userrep;
    }

    /*public void setIndicecurrentqst(int indicecurrentqst){
        this.indicecurrentqst=indicecurrentqst;
    }
    
    public int getIndicecurrentqst(){
        return indicecurrentqst;
    }*/

    public quiz(ArrayList<questions> qst ){
        this.qst=qst; //qst is the name of the array list which contain questions of the quiz
        this.score=0;
        this.indicecurrentqst=0;
    }
    public void displayquestion(){
        questions currentqst = qst.get(indicecurrentqst);
        //affiche currentqst
        System.out.println("Question " + (indicecurrentqst + 1) + ": " + currentqst.getQst());
        //System.out.println(currentqst.questions);
        for(int i=0;i<currentqst.choix.size();i++){
            System.out.println((i+1)+"."+currentqst.choix.get(i));

        }
    }
    public void submitAnswer(int userrep){
        questions currentqst = qst.get(indicecurrentqst);
        if (userrep==currentqst.getRepcorrecte()){
            score++;
        }
    }
    public void displayresult(){
        System.out.println("quiz terminé");
        System.out.println("ton score final est:"+score);
        System.out.println("recap:");
        for(int i = 0; i<qst.size();i++){
            questions questions = qst.get(i);
            String status;
             if(questions.getRepcorrecte()==userrep){
                status="correcte";

             }else{
                status="incorrecte";
             }
             System.out.println((i+1)+"."+status);  
        }
    }
    public void runquizz(){
        Scanner e=new Scanner(System.in);
        for(questions currentqst : qst){
            displayquestion();
            long start= System.currentTimeMillis();
            int timerSec = 10;
            while (System.currentTimeMillis()-start<timerSec*1000){
                System.out.println("saisir votre reponse 1-4:");
                if(e.hasNextLine()){
                    int userrep = e.nextInt();
                    if(userrep>=1 && userrep<=4){
                        setUserrep(userrep);
                        break;
                    }else{
                        System.out.println("reponse invalide veillez entrer un nombre entre 1 et 4");
                    }
                }else{
                    System.out.println("saisir une autre fois un nombre valide entre 1 et 4");
                    e.nextInt();
                }
            }
            submitAnswer(getUserrep());
            indicecurrentqst=indicecurrentqst+1;
        }
        displayresult();
    
    }

}