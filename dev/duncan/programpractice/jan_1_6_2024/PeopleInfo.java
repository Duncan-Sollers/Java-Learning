package dev.duncan.programpractice.jan_1_6_2024;
//@ PeopleInfo is the DTO for file
public class PeopleInfo {


    private String firstName;
    private String lastName;
    private Character sex;
    private Integer age;
    
    public PeopleInfo(){
        
    }

    public PeopleInfo(String firstName,String lastName, Character sex, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getSex() {
        return this.sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    

    
}
