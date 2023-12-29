import java.util.ArrayList;
import java.util.List;
public class mainquiz{
    public static void main(String[] args){
        ArrayList<questions> firstquiz = new ArrayList<questions>();
        firstquiz.add(new questions("what is the capital of tunisia? ", new ArrayList<>(List.of("paris","london","tunis","sousse")),3));
        firstquiz.add(new questions("what is the most popular traditional dish in tunisia? ",new ArrayList<>(List.of("lablebi","pizza","couscous","rice")),3));
        quiz myquiz= new quiz(firstquiz);
        myquiz.runquizz();
    }
}