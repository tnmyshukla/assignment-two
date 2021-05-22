//import org.junit.jupiter.api.Test;

import models.UserDetails;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestUnit {
    ArrayList<String> al=new ArrayList<>();

    @Test()
    public void userDetailsTest(){

        al.add("A");al.add("B");al.add("C");al.add("E");
        final HashSet<String> setOfCourse=new HashSet<>();
        setOfCourse.add("A");setOfCourse.add("B");setOfCourse.add("C");setOfCourse.add("E");
        final UserDetails userDetails=new UserDetails("Tanmay",32,"Lucknow",2,al);
//        assertThrows(InvalidInputException.class,);
        assertNotNull("User details object must not be null",userDetails);
        assertEquals("Name should be Tanmay","Tanmay",userDetails.getName());
        assertEquals("Age should be initialised",32,userDetails.getAge());
        assertEquals("Roll no should be initialised",2,userDetails.getRollNo());
        assertEquals("Address should be initialised","Lucknow",userDetails.getAddress());
        assertEquals("Course should be set properly",setOfCourse,userDetails.getSetOfCourse());
        assertEquals("String should be returned properly","Tanmay\t\t\t2\t\t\t32\t\t\tLucknow\t\t\tA,B,C,E,",userDetails.getDetailsAsString());

    }
    @Test
    public void userManagerTest(){
//        InputStream sysInBackup = System.in; // backup System.in to restore it later
//        ByteArrayInputStream in = new ByteArrayInputStream("5\nTanmay\n25\nSydney\n63\nABCD\n5\n".getBytes());
//        System.setIn(in);
//        UserManager userManager=new UserManager();
//        try {
//            userManager.startManager();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.setIn(sysInBackup);
    }



}
