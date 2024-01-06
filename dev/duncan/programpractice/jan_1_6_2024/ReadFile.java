package dev.duncan.programpractice.jan_1_6_2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadFile {
    private BufferedReader data = null;
    private String fileName = null;

    public ReadFile(){
        fileName = "dataFile.csv";
    }

    public ReadFile(String fileName){
        this.fileName = fileName;
    }

    public boolean openFile(){
        data
          = new BufferedReader(new InputStreamReader(ReadFile.class.getResourceAsStream(fileName)));
        return true;
    }

    public boolean readFile(){
        try {
            String line= data.readLine();

            while(line != null){ 
                //System.out.println(line);
                StringTokenizer st = new StringTokenizer(line , ",");
                for(int i=1 ; i<4 ; i++){
                    PeopleInfo peopleInfo = new PeopleInfo();
                    String currToken = st.nextToken();
                    switch (i){
                        case 1:
                            peopleInfo.setFirstName(currToken);
                            break;
                        case 2:
                            peopleInfo.setLastName(currToken);
                            break;
                        case 3:
                            peopleInfo.setSex(currToken.charAt(0));
                            break;
                        case 4:
                            peopleInfo.setAge(Integer.valueOf(currToken));
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                }
                //System.out.println("\n");
                line = data.readLine();
                
            }
            return true;}

        catch(Exception e){
            return false;
        }
    }
}
