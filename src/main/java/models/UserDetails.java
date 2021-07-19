package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 * The type User details.
 */
public class UserDetails implements Serializable {
  private String name;
  private int age;
  private String address;
  private int rollNo;
  private HashSet<String> setOfCourse = new HashSet<>();

    /**
     * Instantiates a new User details.
     *
     * @param name        the name
     * @param age         the age
     * @param address     the address
     * @param rollNo      the roll no
     * @param subjectList the subject list
     */
    public UserDetails(final String name, final int age, final String address, final int rollNo, final ArrayList<String> subjectList) {
    this.name = name;
//        setName(name);
//        setAge(age);
//        setAddress(address);
//        setRollNo(rollNo);
//        final HashSet<String> sOC=new HashSet<>();
//        sOC.addAll(subjectList);
//        setSetOfCourse(sOC);
    this.age = age;
    this.address = address;
    this.rollNo = rollNo;
    setOfCourse.addAll(subjectList);
  }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
    return name;
  }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
    return address;
  }

    /**
     * Gets roll no.
     *
     * @return the roll no
     */
    public int getRollNo() {
    return rollNo;
  }

    /**
     * Gets set of course.
     *
     * @return the set of course
     */
    public Set<String> getSetOfCourse() {
    return setOfCourse;
  }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
    return age;
  }

    /**
     * Gets details as string.
     *
     * @return the details as string
     */
    public String getDetailsAsString() {
    String course = "";
    for (final String c : setOfCourse) {
      course = course + c + ",";
    }
    return new StringBuilder().append(name).append("\t\t\t").append(rollNo).append("\t\t\t").append(age).append("\t\t\t").append(address).append("\t\t\t").append(course).toString();

  }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(final int age) {
    this.age = age;
  }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
    this.name = name;
  }

    /**
     * Sets roll no.
     *
     * @param rollNo the roll no
     */
    public void setRollNo(final int rollNo) {
    this.rollNo = rollNo;
  }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(final String address) {
    this.address = address;
  }

    /**
     * Sets set of course.
     *
     * @param setOfCourse the set of course
     */
    public void setSetOfCourse(final HashSet<String> setOfCourse) {
    this.setOfCourse = setOfCourse;
  }

}
