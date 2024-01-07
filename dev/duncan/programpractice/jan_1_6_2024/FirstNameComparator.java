package dev.duncan.programpractice.jan_1_6_2024;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<PeopleInfo> {
    @Override
    public int compare(PeopleInfo lhs, PeopleInfo rhs) {
        return lhs.getFirstName().compareTo(rhs.getFirstName());

  }
}
