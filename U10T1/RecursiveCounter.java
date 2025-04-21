public class RecursiveCounter {
    public static void main(String [] args) {
        recursiveCounter(1);
    }

    public static void recursiveCounter(int number) {
        // write this method
        System.out.println(number);
        if (number < 10) {
            recursiveCounter(number + 1);
        }
    }
}
