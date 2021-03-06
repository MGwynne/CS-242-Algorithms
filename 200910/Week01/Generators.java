import java.util.Random;

class Array_Generators {

    public static long[] sorted_up(int n) {
        long[] A = new long[n];
        for (int i = 0; i < n; i++)
	    A[i] = i;
        return A;
    }

    public static long[] sorted_down(int n) {
        long[] A = new long[n];
        for (int i = 0; i < n; i++)
	    A[i] = n-i;
        return A;
    }

    public static long[] sorted_rand(int n) {
        long[] A = new long[n];
	Random randomGenerator = new Random();
        for (int i = 0; i < n; i++)
 	    A[i] = randomGenerator.nextInt() % (5 * n);
        return A;
    }

}

