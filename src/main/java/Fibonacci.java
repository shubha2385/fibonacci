public class Fibonacci {

    /**
     * to apply fibonacci algorithm
     * @param index
     * @return
     */
    public int calculate(int index) {
        if (index == 0 || index == 1) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}