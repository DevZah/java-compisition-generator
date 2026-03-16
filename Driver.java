import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Composition comp = new Composition();

        int choice = 0;

        while (choice != 4) {

            System.out.println("This program allows a user to enter a written composition in pieces:");
            System.out.println(" 1. Enter a new sentence.");
            System.out.println(" 2. Start a new paragraph");
            System.out.println(" 3. Print the composition");
            System.out.println(" 4. QUIT");

            System.out.print("Your menu selection is: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            if (choice == 1) {
                System.out.println("Type a sentence, then press ENTER;");
                String sentence = scnr.nextLine();
                comp.addASentence(sentence);
            }

            else if (choice == 2) {
                comp.addAParagraph();
            }

            else if (choice == 3) {
                comp.print();
            }
        }

        System.out.println("Bye-bye");
    }
}