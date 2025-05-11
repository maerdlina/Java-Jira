package customException;

public class Calculator {
    public static double divide(double dividend, double divisor) throws divisionByZero {
        if (divisor == 0) {
            throw new divisionByZero();
        }
        return dividend / divisor;
    }

    // Можно добавить другие операции (сложение, вычитание, умножение)
}