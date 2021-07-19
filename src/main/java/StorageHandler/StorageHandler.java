package StorageHandler;

import models.UserDetails;

import java.util.ArrayList;

/**
 * The interface Storage handler.
 */
public interface StorageHandler {
    /**
     * Save list to disk.
     *
     * @param userDetailsList the user details list
     * @throws Exception the exception
     */
    void saveListToDisk(ArrayList<UserDetails> userDetailsList) throws Exception;

    /**
     * Read list from disk array list.
     *
     * @return the array list
     * @throws Exception the exception
     */
    ArrayList<UserDetails> readListFromDisk() throws Exception;
}
