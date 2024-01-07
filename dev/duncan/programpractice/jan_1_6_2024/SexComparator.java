package dev.duncan.programpractice.jan_1_6_2024;

import java.util.Comparator;

public class SexComparator implements Comparator<PeopleInfo>{
    @Override
    public int compare(PeopleInfo lhs, PeopleInfo rhs){
        return lhs.getSex().compareTo(rhs.getSex());
    }
}
