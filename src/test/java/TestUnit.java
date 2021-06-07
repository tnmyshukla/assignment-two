//import org.junit.jupiter.api.Test;

import models.UserDetails;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestUnit {
    ArrayList<String> al=new ArrayList<>();
    final UserDetails userDetails;
    final Set<String> setOfCourse;
    public TestUnit(){
    al.add("A");al.add("B");al.add("C");al.add("E");
    setOfCourse=new HashSet<>();
    setOfCourse.add("A");setOfCourse.add("B");setOfCourse.add("C");setOfCourse.add("E");
    userDetails=new UserDetails("Tanmay",32,"Lucknow",2,al);
    }

    @Test
    public void testStringConversion(){
        assertEquals("String should be returned properly","Tanmay\t\t\t2\t\t\t32\t\t\tLucknow\t\t\tA,B,C,E,",userDetails.getDetailsAsString());
    }
    @Test
    public void testObjectCreation(){
        assertNotNull("User details object must not be null",userDetails);
    }
    @Test
    public void testAgeValue(){
        assertEquals("Age should be initialised",32,userDetails.getAge());
    }
    @Test
    public void testName(){
        assertEquals("Name should be Tanmay","Tanmay",userDetails.getName());
    }
    @Test
    public void testRollValue(){
        assertEquals("Roll no should be initialised",2,userDetails.getRollNo());
    }
    @Test
    public void testAddressValue(){
        assertEquals("Address should be initialised","Lucknow",userDetails.getAddress());
    }
    @Test
    public void testCourseValue(){
        assertEquals("Course should be set properly",setOfCourse,userDetails.getSetOfCourse());
    }

//    @Test
//    public void userManagerTest(){
////        InputStream sysInBackup = System.in; // backup System.in to restore it later
////        ByteArrayInputStream in = new ByteArrayInputStream("5\nTanmay\n25\nSydney\n63\nABCD\n5\n".getBytes());
////        System.setIn(in);
////        UserManager userManager=new UserManager();
////        try {
////            userManager.startManager();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        System.setIn(sysInBackup);
//    }


}
