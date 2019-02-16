package DemoPack.Lesson12.Abstract.InnerClassExample;

public class DataStructure {

    //Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    private class EvenIterator implements DataStructureIterator {   //Note that the EvenIterator class refers directly
                                                                    // to the arrayOfInts instance variable of the DataStructure object.
        //Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            //Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            //Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            //Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public DataStructure() {

        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }

    }

    public void printEven() {
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}




