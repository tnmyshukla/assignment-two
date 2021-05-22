package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class UserDetails implements Serializable{
    private String name;
    private int age;
    private String address;
    private int rollNo;
    private HashSet<String> setOfCourse=new HashSet<>();
    public UserDetails(final String name,final int age, final String address,final int rollNo,final ArrayList<String>subjectList){
        this.name=name;
//        setName(name);
//        setAge(age);
//        setAddress(address);
//        setRollNo(rollNo);
//        final HashSet<String> sOC=new HashSet<>();
//        sOC.addAll(subjectList);
//        setSetOfCourse(sOC);
        this.age=age;
        this.address=address;
        this.rollNo=rollNo;
        setOfCourse.addAll(subjectList);
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Set<String> getSetOfCourse() {
        return setOfCourse;
    }

    public int getAge() {
        return age;
    }
    public String getDetailsAsString(){
        String course="";
        for(final String c:setOfCourse){
            course=course+c+",";
        }
        return new StringBuilder().append(name).append("\t\t\t").append(rollNo).append("\t\t\t").append(age).append("\t\t\t").append(address).append("\t\t\t").append(course).toString();

    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRollNo(final int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public void setSetOfCourse(final HashSet<String> setOfCourse) {
        this.setOfCourse = setOfCourse;
    }

}
