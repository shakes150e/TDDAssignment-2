package za.ac.cput.nature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Author: Sanele Ngwenya
 * No.: 216019699
 * Group: PT
 */

class MyPeopleTest {
    MyPeople CollectionListSetMap = new MyPeople();
    public Assertions Assert;

    @Test
    public void myMap() {
        HashMap myActual = CollectionListSetMap.myMap();
        String myExpectation="{Tally=20, Zodwa=25, Zihle=10, Sammy=14}";
        myExpectation=myExpectation.substring(1, myExpectation.length()-1);
        String[] keyValuesPairs = myExpectation.split(",");
        Map<String,String>map = new HashMap<>();
        for(String pair : keyValuesPairs)
        {
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }
        Assert.assertTrue(myActual.equals(myActual));

    }

    @Test
    public void mySet() {
        TreeSet myAct =CollectionListSetMap.mySet();
        String[] arrayNames ={"Asanda", "Ayanda", "Sanele", "Sipho", "Zinhle", "Zodwa"};
        List<String> list = Arrays.asList(arrayNames);
        Set<String> exSet = new TreeSet<String>(list);

        Assert.assertEquals(exSet,myAct);
    }

    @Test
    public void myList() {
        List actOut =CollectionListSetMap.myList();
        ArrayList<String> exOut = new ArrayList<>();
        exOut.add("20 Tally");
        exOut.add("25 Zodwa");
        exOut.add("10 Zihle");
        exOut.add("45 Mother");
        exOut.add("50 Father");
        exOut.add("14 Sammy");
        exOut.add("02 Thoko");

        Assert.assertEquals(exOut,actOut);
    }

    @Test
    public void myCollection() {
        Collection exCol =CollectionListSetMap.myCollection();
        String [] arArray = {"02 Thoko", "10 Zihle", "14 Sammy",
                "20 Tally", "25 Zodwa", "45 Mother", "50 Father"};
        ArrayList<String> cardsList = new ArrayList<String>(Arrays.asList(arArray));
        Assert.assertEquals(cardsList,exCol);
    }
}