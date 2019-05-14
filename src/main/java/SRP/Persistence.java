package SRP;

import java.io.*;

public class Persistence {

    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite)
            throws FileNotFoundException
    {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)){
                out.println(journal.toString());
            }
        }
    }

    public void deleteJournalFile(String filename){
        if (new File(filename).exists()){
            new File(filename).delete();
        }
    }

    public Journal loadJournalFile(String filename) throws IOException {
        Journal j = new Journal();
        if (new File(filename).exists()){
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String text = null;
                for (;;) {
                    if ( (text = br.readLine()) != null ){
                        text = text.substring(text.indexOf(" ") + 1);
//                        System.out.println(text.indexOf(" "));
                        j.addEntry(text);
                    } else break;
                }
                return j;
            }
        }
        return null;
    }


}
