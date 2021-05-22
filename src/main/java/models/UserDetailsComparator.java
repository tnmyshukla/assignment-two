package models;

import java.util.Comparator;

public class UserDetailsComparator implements Comparator<UserDetails> {

    @Override
    public int compare(final UserDetails o1,final UserDetails o2) {
         int del = o1.getName().compareToIgnoreCase(o2.getName());
        if (del == 0) {
            del= Integer.compare(o1.getAge(), o2.getAge());
        }
        return del;
    }
}
