public class main {
    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibRecursive(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = fibIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibRecursive(n)+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIterative(n) + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    private static int fibRecursive(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibRecursive(x - 1) + fibRecursive(x - 2);
    }

    public static int fibIterative(int n){
        if (n < 2) {
            return 1;
        }
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i < n - 1; i++) {
            int oldnum = num2;
            num2 = num1 + num2;
            num1 = oldnum;
        }
        return num2;
    }

}