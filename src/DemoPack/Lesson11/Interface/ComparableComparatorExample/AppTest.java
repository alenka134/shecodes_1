package DemoPack.Lesson11.Interface.ComparableComparatorExample;

import java.util.ArrayList;
import java.util.TreeSet;

public class AppTest {
    public static void main(String[] args) {
      // TreeSet<House> myHouseArrayList = new TreeSet<>();   // TreeSet stores all the elements are sorted
       ArrayList<House>myHouseArrayList = new ArrayList<>(); //all the elements placed in order of addition

        //Create three objects and put them in TreeSet
        House firstHouse = new House(100, 1200, "Las Vegas", true);
        House secondHouse = new House(130, 1500, "Tokio", true);
        House thirdHouse = new House(170, 2000, "Tel Aviv", false);

        //.add - method adds an element to the set
        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);


        for (House h: myHouseArrayList){
            System.out.println(h);
        }

        //Creating object of PriceComparator class

        PriceComparator myPriceComparator = new PriceComparator();
        myHouseArrayList.sort(myPriceComparator);   // call SORT method for sorting Array List

        System.out.println("\nSorted: ");
        for (House h: myHouseArrayList){
            System.out.println(h);
        }
    }
}
