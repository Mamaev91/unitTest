import static org.assertj.core.api.Assertions.assertThat;

public class Homework1 {
    public static void main(String[] args){
        calculatingDiscount(100.0, 30.0);
        expectedValue();
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        double discount = (100 - discountAmount)/100;

        return purchaseAmount * discount ; // Метод должен возвращать сумму покупки со скидкой
    }
    public static void expectedValue() {
        assertThat(70.0).isEqualTo(calculatingDiscount(100.0, 30.0));
    }

}

