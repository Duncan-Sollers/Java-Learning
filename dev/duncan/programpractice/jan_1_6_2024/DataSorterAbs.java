package dev.duncan.programpractice.jan_1_6_2024;

import java.util.List;
import java.util.Scanner;

public class DataSorterAbs {
    private String response;
    public void userInput(){
        System.out.println("Welcome to the Files Management System");
        System.out.println("Please input the file name as follows: file.extension");

        try (Scanner fileNameReader = new Scanner(System.in)) {
            ReadFile fileReaderTest =  new ReadFile(fileNameReader.nextLine());

            System.out.println("Please input the file delimiter character [1 CHAR ONLY]");
            response = fileNameReader.nextLine();
            fileReaderTest.ReadDelimiter(response);

            System.out.println("The sort options are: \nFirst name........first\nLast name.........last\nSex...............sex\nAge...............age\nPrint.............print");
            System.out.print(">");

            try (Scanner userChoice = new Scanner(System.in)) {
                this.response = userChoice.nextLine();
            }
            System.out.print("\n");
            System.out.println("Loading:");

            fileReaderTest.openFile();
            List<PeopleInfo> results = fileReaderTest.readFile();
            
            switch (response) {
                case "first":
                results.sort(new FirstNameComparator());
                for (PeopleInfo current: results){
                    System.out.println(current);
                }   
                    break;
                //////////////////////////////////////////
                case "last":
                results.sort(new LastNameComparator());
                for (PeopleInfo current: results){
                    System.out.println(current);
                }
                    break;
                ////////////////////////////////////////////
                case "sex":
                results.sort(new SexComparator());
                for (PeopleInfo current: results){
                    System.out.println(current);
                }   
                    break;
                ////////////////////////////////////////////
                case "age":
                results.sort(new AgeComparator());
                for (PeopleInfo current: results){
                    System.out.println(current);
                }
                    break;
                ////////////////////////////////////////////
                case "print":
                    for (PeopleInfo current: results){
                    System.out.println(current);
                }
                    break;
                ////////////////////////////////////////////
                default:
                System.out.println("Invalid Option");
                    break;
            }
        }
        
    }
}
