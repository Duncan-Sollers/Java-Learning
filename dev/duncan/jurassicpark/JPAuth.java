package dev.duncan.jurassicpark;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class JPAuth {
    private  Map<String,String> passwordsMap = new ConcurrentHashMap<String,String>();
    public JPAuth(){
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                JPAuth.class.getResourceAsStream("/dev/duncan/jurassicpark/Password.txt")));

        Stream<String> lines = br.lines();
        List<String> passswords = lines.toList();
        for(String passwordEntry : passswords) {
            addUserAndPassword(passwordEntry);
        }
    }
    private void addUserAndPassword(String currentString){
        System.out.println("***"+currentString);
        String[] values = currentString.split(" ");
        //do i have 2 strings???
        passwordsMap.put(values[0], values[1]);
    }

    public int getNumberOfPasswords() {
        return passwordsMap.size();
    }

    public boolean authenticate(String userName, String password){
        if((userName == null)||(password ==null)){
            return false;
        }
        if (passwordsMap.containsKey(userName)) {
            String storedPassword = passwordsMap.get(userName);
            if (storedPassword.equals(password)) {
                System.out.println("Authentication succesful");
                return true;
            } else {
                System.out.println("Authentication -NOT- succesful");
                return false;
            }
        }

        return false;
    }
}
