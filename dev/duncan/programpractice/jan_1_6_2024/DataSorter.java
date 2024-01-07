//test
package dev.duncan.programpractice.jan_1_6_2024;

import java.util.List;

public class DataSorter {
    public static void main(String[] args) {
        ReadFile fileReaderTest =  new ReadFile();
        fileReaderTest.openFile();
        List<PeopleInfo> results = fileReaderTest.readFile();
        results.sort(new AgeComparator());
        for (PeopleInfo current: results){
            System.out.println(current);
        }
    }
}
