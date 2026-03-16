import java.util.ArrayList;

public class Composition {

    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private int currentParagraph = -1;

    public void addAParagraph() {
        Paragraph newParagraph = new Paragraph();
        paragraphs.add(newParagraph);
        currentParagraph++;
    }

    public void addASentence(String aSentence) {

        if (currentParagraph == -1) {
            addAParagraph();
        }

        paragraphs.get(currentParagraph).addASentence(aSentence);
    }

    public void print() {

        System.out.println();

        for (Paragraph p : paragraphs) {
            p.print();
            System.out.println();
        }
    }
}