package StorageHandler;

import models.UserDetails;

import java.util.ArrayList;

public interface StorageHandler {
    void saveListToDisk(ArrayList<UserDetails> userDetailsList) throws Exception;
    ArrayList<UserDetails> readListFromDisk() throws Exception;
}
