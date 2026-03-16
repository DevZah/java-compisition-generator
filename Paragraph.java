import java.util.ArrayList;

public class Paragraph {

    private ArrayList<Sentence> sentences = new ArrayList<>();

    public void addASentence(String theText) {
        Sentence newSentence = new Sentence(theText);
        sentences.add(newSentence);
    }

    public void print() {
        for (Sentence s : sentences) {
            s.print();
        }
    }
}