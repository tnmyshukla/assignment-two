package StorageHandler;
import models.UserDetails;

import java.io.*;
import java.util.ArrayList;

public class DiskStorageHandler implements StorageHandler {
    @Override
    public void saveListToDisk(ArrayList<UserDetails>userDetailsList)throws Exception{
        try{
            FileOutputStream fos=new FileOutputStream("userData");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(userDetailsList);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("IO exception"+e.toString());
            throw e;
        }
    }
    @Override
    public ArrayList<UserDetails> readListFromDisk() throws Exception{
        ArrayList<UserDetails>userDetailsArrayList;
        try{
            FileInputStream fis=new FileInputStream("userData");
            ObjectInputStream ois=new ObjectInputStream(fis);
//            @SuppressWarnings("unchecked")
            userDetailsArrayList= (ArrayList<UserDetails>) ois.readObject();
            ois.close();
            fis.close();
        }
//        catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//            throw e;
//        }
        catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return userDetailsArrayList;
    }
}
