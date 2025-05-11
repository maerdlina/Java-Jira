package customException;

public class divisionByZero extends ArithmeticException {
    public divisionByZero() {
        super("Деление на ноль недопустимо!");
    }

    public divisionByZero(String message) {
        super(message);
    }
}