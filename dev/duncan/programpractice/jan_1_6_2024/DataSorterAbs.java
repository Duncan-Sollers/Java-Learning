package dev.duncan.programpractice.jan_1_6_2024;

import java.util.List;
import java.util.Scanner;

public class DataSorterAbs {
    private String response;
    private String response2;
    private String response3;
    public void userInput(){
        try (Scanner fileNameReader = new Scanner(System.in)) {
            
            System.out.println("Welcome to the Files Management System");
            System.out.println("Please input the file name as follows: file.extension");
            this.response = fileNameReader.nextLine();
            
            

            System.out.println("Please input the file delimiter character [1 CHAR ONLY]");
            
            this.response2 = fileNameReader.nextLine();
            
            ReadFile fileReaderTest =  new ReadFile(response,response2);

            System.out.println("The sort options are: \nFirst name........first\nLast name.........last\nSex...............sex\nAge...............age\nPrint.............print");
            System.out.print(">");

            try (Scanner userChoice = new Scanner(System.in)) {
                this.response3 = userChoice.nextLine();
            }
            System.out.print("\n");
            System.out.println("Loading:");

            fileReaderTest.openFile();
            List<PeopleInfo> results = fileReaderTest.readFile();
            
            switch (response3) {
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
