package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Cristiam Enciso
 */


public class Person {
    private String firstName;
    private String lastName;
    private String salary;


    public void setFirstName(String s) {
        firstName = s;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String s){
        lastName = s;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSalary(String s) {
        salary = s;
    }
    public String getSalary() {
        return salary;
    }


}
