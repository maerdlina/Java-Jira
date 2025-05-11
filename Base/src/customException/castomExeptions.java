package customException;

public class castomExeptions {
    public static void main(String[] args){
        try {
            double result = Calculator.divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (divisionByZero e) {
            System.err.println("Ошибка: " + e.getMessage());
            // Можно добавить дополнительную обработку
        }
    }
}