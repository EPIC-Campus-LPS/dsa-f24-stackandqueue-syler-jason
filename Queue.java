import java.awt.*;

/**
 * Allows access to the first element in the array
 */
public class Queue {
    private int[] arr = {};

    /**
     * Runtime = o(n)
     * @param num the given number to add to the array
     * <pre>
     *
     * Creates the new array with 1 more element to the last array
     * Loops threw all of the current elements and places them in the new array
     * sets the num to the last spot in the array
     * sets the new array to the last array
     * </pre>
     */
    public void add(int num)
    {
        int[] newarr = new int[arr.length+1];
        for (int i = 0;i < arr.length; i++)
            newarr[i] = arr[i];

        newarr[arr.length] = num;
        arr = newarr;
    }

    /**
     *  Runtime = O(n) - 1
     * <pre>
     *
     * Checks if the array length if over 0 if not does No Such Element Exception
     * Creates the new array with 1 less element to the last array
     * Loops threw all of the elements starting from the 2nd element and sets the new array but shifts them left one
     * sets the new array to the last array
     * </pre>
     * @return the first element in the Queue
     */
    public int remove()
    {
        int remove = 0;
        if (arr.length > 0) {
            int[] newarr = new int[arr.length - 1];
            remove = arr[0];
            for (int i = 1; i < arr.length; i++)
                newarr[i - 1] = arr[i];

            arr = newarr;
        }
        else
            System.out.println("No Such Element Exception");

        return remove;
    }

    /**
     * Runtime = 1
     * @return the Head element in Queue
     */
    public int peak()
    {
        return arr[0];
    }

    /**
     * Runtime = 1
     * @return if the length of the array is 0
     */
    public boolean isEmpty()
    {
        return arr.length == 0;
    }

    /**
     * Runtime = 1
     * @return the array length
     */
    public int size()
    {
        return arr.length;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(16);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.peak());
        q.add(13);
        System.out.println("Empty? "+q.isEmpty());
        q.add(15);
        System.out.println("size: "+q.size());
        int num = q.remove() + q.remove();
        System.out.println(num);
    }
}
