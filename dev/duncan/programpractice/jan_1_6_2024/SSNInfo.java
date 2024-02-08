package dev.duncan.programpractice.jan_1_6_2024;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SSNInfo {
    private Map<Integer,String> ssnInfoMap = new HashMap<Integer,String>();
    private Integer ssnValue;
    private String name;

    public SSNInfo(){
        //this adds a default  user tied to #1
        this.ssnValue = 1;
        this.name = "defaultName";
    }

    /*
    public SSNInfo(Integer ssnValue){
        this.ssnValue = ssnValue;
    }
    public SSNInfo(String name){
        this.name = name;
    }

    public SSNInfo(Integer ssnValue, String name){
    */
    public void addSSNRecord(Integer ssnValue, String name){
        ssnInfoMap.put(ssnValue, name);
    }
    public void removeSSNRecord(Integer ssnValue, String name){
        ssnInfoMap.remove(ssnValue, name);
    }
    public void replaceSSNRecord(Integer ssnValue, String oldName, String newName){
        ssnInfoMap.replace(ssnValue, oldName, newName);
    }
    public boolean hasNoValues(){
        if (ssnInfoMap.isEmpty() == true){
            return true;
        }
        else {
            return false;
        }
        
    }
    public String getValue(Integer key){
        return ssnInfoMap.get(key);
    }

    
}
