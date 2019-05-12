import java.io.FileNotFoundException;

public class MainClassJournal {

    public static void main(String[] args) throws FileNotFoundException {

        Journal j = new Journal();
        
        j.addEntry("I ate an apple.");
        j.addEntry("We danced all night.");

        Persistence p = new Persistence();

        String filename = "day1.txt";
        p.saveToFile(j, filename,true);

    }

}
