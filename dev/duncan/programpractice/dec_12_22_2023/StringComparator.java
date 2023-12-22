package dev.duncan.programpractice.dec_12_22_2023;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    /*
     * 0 means the same order
     * Less than < means lhs is bigger than rhs -1
     * Greater than > means rhs is bigger than lhs +1
     */
    @Override
    public int compare(String lhs, String rhs) {
          return lhs.compareTo(rhs);

    }
    
}
