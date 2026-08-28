import java.util.Arrays;

public class Solution {

    public static int count(Point[] a, Point[] b) {
        int count = 0, i = 0, j = 0;

        // native Java mergesort implementation: O(n log n)
        Arrays.sort(a);
        Arrays.sort(b);

        while (i < a.length && j < b.length) {
            int comparison = a[i].compareTo(b[j]);

            if (comparison == 0) { // both objects are equal, increment the count pointer and step to next iteration
                count++;
                i++;
                j++;
            } else if (comparison < 0) i++; // a's object is greater than b's, so increment a's iteration pointer
            else j++; // a's object is less than b's, so increment b's iteration pointer
        }

        return count;
    }
}

class Point implements Comparable<Point> { // represents each point
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point that) { // used for comparing and sorting Point objects in the arrays
        if (this.x < that.x)
            return -1;
        if (this.x > that.x)
            return 1;
        if (this.y < that.y)
            return -1;
        if (this.y > that.y)
            return 1;
        return 0; // both Point objects are lexicographically equal, so they should not be reordered
    }
}
