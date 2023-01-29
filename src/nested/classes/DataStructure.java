package nested.classes;

public class DataStructure {
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        // fill array with ascending int value
        for (int i=0; i<SIZE; i++) {
            arrayOfInts[i]=i;
        }
    }

    public void printEven() {
        // print out value array
        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {

    }

    private class EvenIterator implements DataStructureIterator {

        private int nextIndex = 0;
        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String str[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
