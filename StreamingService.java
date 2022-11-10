import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StreamingService {

    private ArrayList<DigitalContent> content;

    public StreamingService(ArrayList<DigitalContent> content) {
        this.content = content;
    }

    public void add(DigitalContent input) {
        //this assumes you have already created the DigitalContent object you are referencing
        if (input != null) {
            content.add(input);
            System.out.println(content.toString());
        } else {
            System.out.println("Digital Content object not found");
        }
    }

    public ArrayList<DigitalContent> match(String query){
        ArrayList<DigitalContent> matches = new ArrayList<>();
        int counter = 0;
        for(DigitalContent dc : content){
            if(query.equals(dc.getTitle())){
                counter++;
                matches.add(dc);
            }
            System.out.println("Matches found = " + counter);
        }
        System.out.println("Matching content: ");
        return matches;
    }

    @Override
    public String toString() {
        content.sort(Comparator.comparing(DigitalContent::getTitle));

        return "StreamingService{" +
                "content=" + content +
                '}';
    }
}
