//import org.junit.jupiter.api.Test;

import models.UserDetails;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The type Test unit.
 */
public class TestUnit {
    /**
     * The Al.
     */
    ArrayList<String> al = new ArrayList<>();
    /**
     * The User details.
     */
    final UserDetails userDetails;
    /**
     * The Set of course.
     */
    final Set<String> setOfCourse;

    /**
     * Instantiates a new Test unit.
     */
    public TestUnit() {
    al.add("A");
    al.add("B");
    al.add("C");
    al.add("E");
    setOfCourse = new HashSet<>();
    setOfCourse.add("A");
    setOfCourse.add("B");
    setOfCourse.add("C");
    setOfCourse.add("E");
    userDetails = new UserDetails("Tanmay", 32, "Lucknow", 2, al);
  }

    /**
     * Test string conversion.
     */
    @Test
  public void testStringConversion() {
    assertEquals("String should be returned properly", "Tanmay\t\t\t2\t\t\t32\t\t\tLucknow\t\t\tA,B,C,E,", userDetails.getDetailsAsString());
  }

    /**
     * Test object creation.
     */
    @Test
  public void testObjectCreation() {
    assertNotNull("User details object must not be null", userDetails);
  }

    /**
     * Test age value.
     */
    @Test
  public void testAgeValue() {
    assertEquals("Age should be initialised", 32, userDetails.getAge());
  }

    /**
     * Test name.
     */
    @Test
  public void testName() {
    assertEquals("Name should be Tanmay", "Tanmay", userDetails.getName());
  }

    /**
     * Test roll value.
     */
    @Test
  public void testRollValue() {
    assertEquals("Roll no should be initialised", 2, userDetails.getRollNo());
  }

    /**
     * Test address value.
     */
    @Test
  public void testAddressValue() {
    assertEquals("Address should be initialised", "Lucknow", userDetails.getAddress());
  }

    /**
     * Test course value.
     */
    @Test
  public void testCourseValue() {
    assertEquals("Course should be set properly", setOfCourse, userDetails.getSetOfCourse());
  }




}
