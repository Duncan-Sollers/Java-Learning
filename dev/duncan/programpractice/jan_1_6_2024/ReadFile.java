package dev.duncan.programpractice.jan_1_6_2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public List<PeopleInfo> readFile(){
        List<PeopleInfo> peopleList = new ArrayList<PeopleInfo>();
        try {
            String line= data.readLine();

            while(line != null){ 
                //System.out.println(line);
                StringTokenizer st = new StringTokenizer(line , ",");
                PeopleInfo peopleInfo = new PeopleInfo();
                for(int i=1 ; i<=4 ; i++){
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
                            throw new IllegalStateException("unknown collumn number " + i);
                    }
                    
                }
                peopleList.add(peopleInfo);
                //System.out.println("People info " + peopleInfo.toString());
                
                line = data.readLine();
                
            }
            return peopleList;}

        catch(Exception e){
            
            return Collections.emptyList();
        }
    }
}
