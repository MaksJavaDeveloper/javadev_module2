package javadev_unit_module2;

public class SumCalculator {

    public int sum(int n) {

        if(n == 0) {
            throw new IllegalArgumentException("Input number is 0");
        }
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }
}
