public class RecursionLecture {

    private static long [] memoTable = new long[MAX_FIB_NUMBER];
    public static long fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
//        return fib(n-1) + fib(n-2);

        // if we've already calculated fib(n) then just return it
        if (memoTable[n] !=0) {
            return memoTable[n];
        }

        long fibN = fib(n - 1) + fib(n -2);
        //save fib n to the memoTable for later reuse
        memoTable[n] = fibN;
        return fibN;


    }

    // Recursive def of min()
    // hallmark 1: min(a, n) = smaller of a [n-1] and min(a, n-1)
    // hallmark 2: min(a,1) = a[0]



    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(160));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));

    }

}
