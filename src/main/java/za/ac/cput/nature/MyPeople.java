package za.ac.cput.nature;

import java.util.*;

/**
 * Author: Sanele Ngwenya
 * No.: 216019699
 * Group: PT
 */

public class MyPeople {
    ArrayList<String>myFamilyNameAge = new ArrayList<String>();

    // MyFirst HashMap method
    public HashMap myMap(){
        HashMap<String,Integer> myFamily = new HashMap<>();
        myFamily.put("Asanda", 30);
        myFamily.put("Ayanda", 28);
        myFamily.put("Sanele", 12);
        myFamily.put("Sipho", 22);
        return myFamily;
    }

    // myFirst List
    public TreeSet mySet(){
        String mySibling[] = {"Asanda", "Ayanda","Sanele","Sipho","Zinhle","Zodwa"};
        Set<String> set = new HashSet<String>();
        set.add(mySibling[0]);
        set.add(mySibling[1]);
        set.add(mySibling[2]);
        set.add(mySibling[3]);
        set.add(mySibling[4]);
        set.add(mySibling[5]);

        TreeSet sortedSet = new TreeSet<String>(set);
        return sortedSet;
    }

    public ArrayList myList(){
        myFamilyNameAge.add("20 Tally");
        myFamilyNameAge.add("25 Zodwa");
        myFamilyNameAge.add("10 Zihle");
        myFamilyNameAge.add("45 Mother");
        myFamilyNameAge.add("50 Father");
        myFamilyNameAge.add("14 Sammy");
        myFamilyNameAge.add("02 Thoko");

        System.out.println(myFamilyNameAge);

        for (String i : myFamilyNameAge) {
            // System.out.println(i);
        }
        return myFamilyNameAge;
    }

    public ArrayList myCollection() {
        myFamilyNameAge.add("20 Tally");
        myFamilyNameAge.add("25 Zodwa");
        myFamilyNameAge.add("10 Zihle");
        myFamilyNameAge.add("45 Mother");
        myFamilyNameAge.add("50 Father");
        myFamilyNameAge.add("14 Sammy");
        myFamilyNameAge.add("02 Thoko");

        Collections.sort(myFamilyNameAge);
        System.out.println("myFamilyNameAge");
        return myFamilyNameAge;

    }

}

