package SRP;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  Example using SRP (Single Responsibility Principle)
 */

public class MainClassJournal {

    public static void main(String[] args) throws IOException {

        Journal j = new Journal();

        j.addEntry("I ate an apple.");
        j.addEntry("We danced all night.");
        j.addEntry("I enjoyed going to the beach.");

        System.out.println(j.toString());

        Persistence p = new Persistence();

        String filename = "day1.txt";
        p.saveToFile(j, filename,true);

//        p.deleteJournalFile(filename);

        System.out.println("-------------");

        Journal openJournal = p.loadJournalFile(filename);

        System.out.println(openJournal.toString());

        j.addEntry("I was falling in love.");

        System.out.println("-------------");

        System.out.println(j.toString());

        System.out.println(openJournal.toString());
    }

}
