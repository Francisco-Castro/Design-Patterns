package SRP;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> entries = new ArrayList<String>();
    private static Integer count = 0;

    public void addEntry(String entry){
        entries.add((++count) + ": " + entry);
    }

    public void deleteEntry(Integer index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
