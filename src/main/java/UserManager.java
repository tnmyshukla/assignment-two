import StorageHandler.DiskStorageHandler;
import StorageHandler.StorageHandler;
import exceptions.InvalidInputException;
import models.UserDetails;
import models.UserDetailsComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserManager {

    private ArrayList<UserDetails>userDetailsArrayList=new ArrayList<>();
    private void displayMenu(){
        System.out.println("Enter a choice");
        System.out.println("1.Add User details.");
        System.out.println("2.Display User details.");
        System.out.println("3.Delete User details.");
        System.out.println("4.Save User details.");
        System.out.println("5.Exit\n");
    }
    private void addUserDetails(){
        final Scanner scan=new Scanner(System.in);
        String name;
        String age;
        String address;
        String rollNo;
        System.out.println("Enter full name");
        name= scan.nextLine();
        System.out.println("Enter age");
        age= scan.nextLine();
        System.out.println("Enter address");
        address= scan.nextLine();
        System.out.println("Enter roll no");
        rollNo= scan.nextLine();
        System.out.println("Enter the name of courses");
        final String courseString=scan.nextLine();
        final ArrayList<String>al=new ArrayList<>();
        for(final char ch:courseString.toCharArray()){
            if(ch != ' '){
            al.add(String.valueOf(ch));
            }
        }

        validateBlankData(name,age,address,rollNo,courseString);
        validateAgeAndRoll(age,rollNo);
        validateCourse(al);
        final UserDetails userDetails=new UserDetails(name,Integer.parseInt(age),address,Integer.parseInt(rollNo),al);
        userDetailsArrayList.add(userDetails);
        userDetailsArrayList.sort(new UserDetailsComparator());
    }

    private void validateCourse(final ArrayList<String> al) {
        if(al.size()<4){
            throw new InvalidInputException("Minimum number of courses is 4");
        }
        for(final String s:al){
            if(("A".equalsIgnoreCase(s)|| "B".equalsIgnoreCase(s)|| "C".equalsIgnoreCase(s)
                    || "D".equalsIgnoreCase(s) || "E".equalsIgnoreCase(s)|| "F".equalsIgnoreCase(s))==false){
                throw new InvalidInputException("Course must be only among A,B,C,D,E or F");
            }
        }
    }

    private void validateAgeAndRoll(final String age, final String rollNo) {
        try{
            Integer.parseInt(age);
            Integer.parseInt(rollNo);
        }catch (Exception e){
            throw new InvalidInputException("Age and roll no must be integers");
        }
    }

    private void validateBlankData(final String name, final String age, final String address,final  String rollNo, final String courseString) {
        List<String> ls=new ArrayList<>();
        ls.add(name);
        ls.add(age);
        ls.add(address);
        ls.add(rollNo);
        ls.add(courseString);

        if(utils.checkNull(ls)){
            throw new InvalidInputException("Fields can't be null.");
        }
        if(utils.checkEmpty(ls)){
            throw new InvalidInputException("Fields can't be empty.");
        }
        if(utils.checkBlank(ls)){
            throw new InvalidInputException("Fields can't be blank.");
        }
    }

    private void displayUserDetails(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Name\t\t\tRoll Number\t\t\tAge\t\t\tAddress\t\t\tCourses");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        userDetailsArrayList.sort(new UserDetailsComparator());
        userDetailsArrayList.stream().map(UserDetails::getDetailsAsString).forEach(System.out::println);
    }
    private void deleteUserDetails(){
        System.out.println("Enter the roll no to delete");
        final Scanner scan =new Scanner(System.in);
        final String rno= scan.nextLine();
        int rn;
        try{
            rn=Integer.parseInt(rno);
        }catch (ArithmeticException e){
            throw new InvalidInputException("Roll no must be integer");
        }
        final Iterator<UserDetails> itr=userDetailsArrayList.iterator();
        UserDetails obj = null;
        while(itr.hasNext()){
            final UserDetails uD= itr.next();
            if(uD.getRollNo()==rn){
//                userDetailsArrayList.remove(uD);
                obj=uD;
            }
        }
        userDetailsArrayList.remove(obj);
    }
    private void saveUserDetails(){
        final StorageHandler diskStorageHandler=new DiskStorageHandler();
        try {
            diskStorageHandler.saveListToDisk(userDetailsArrayList);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public void startManager() throws Exception {
        DiskStorageHandler diskStorageHandler;
        diskStorageHandler = new DiskStorageHandler();
        try{
            userDetailsArrayList=diskStorageHandler.readListFromDisk();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            throw e;
        }
        displayMenu();
        final Scanner scan=new Scanner(System.in);
        int choice= scan.nextInt();
        while(true){
            switch (choice){
                case 1:
                    try{
                        addUserDetails();
                    }catch (InvalidInputException e){
                        System.out.println(e.getMessage());
                        startManager();
                    }
                    break;
                case 2:
                    try{
                        displayUserDetails();
                    }catch (InvalidInputException e){
                        System.out.println(e.getMessage());
                        startManager();
                    }
                    break;
                case 3:
                    try{
                        deleteUserDetails();
                    }catch (InvalidInputException e){
                        System.out.println(e.getMessage());
                        startManager();
                    }
                    break;
                case 4:
                    try{
                        saveUserDetails();
                    }catch (InvalidInputException e){
                        System.out.println(e.getMessage());
                        startManager();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
//                    throw new InvalidInputException("Invalid Option");
                    startManager();
            }
            displayMenu();
            choice= scan.nextInt();
        }
    }
}
