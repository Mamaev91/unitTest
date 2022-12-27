import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*; // Импортируем классы библиотеки assertJ

public class Seminar1 {

    public static void main(String[] args) {
    // assertConditionA();
    // assertConditionB();
        // System.out.println( sum(2147483647,2));
        //checkingShoppingCart();
      //expectedValue();
        String[] colors = {"aqua","orange","green","violet", "yellow","blue", "gold"};
        testingJavaCollectionsAssertJ(colors);
}
//    public static void assertConditionA () {
//        String[] weekends = {"Суббота", "Воскресенье"};
//        assert weekends.length == 3;
//        System.out.println("В неделе " + weekends.length + " дня выходных");
//    }
//    public static void assertConditionB() {
//        int x = -1;
//        assert x < 0;
//    }
    public static int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Значение выражения вышло за пределы переменной";
        return a + b;
    }
//    public static void happyNY() {
//        Calendar calendar = Calendar.getInstance();
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        String currentDateTime = dateFormat.format(calendar.getTime());
//
//// Получили строку currentDateTime в формате "09/12/2022 20:20:04"
//
//        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2022 год :(";
//        System.out.println("С новым годом!");
//    }
    public static void checkingShoppingCart() {
        ArrayList <String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");
        productCategories.add("drinks");

        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            switch (product) {
                case "apple" -> System.out.println("category: " + productCategories.get(0));
                case "tomato" -> System.out.println("category: " + productCategories.get(1));
                case "bread" -> System.out.println("category: " + productCategories.get(2));
                case "water" -> System.out.println("category: " + productCategories.get(3));
                default -> {
                    assert false : "Unknown category for the product " + product;
                }
            }
        }
    }
    public static void expectedValue() {
        assertThat(6).isEqualTo(sum(2, 3));
    }
    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }
}
