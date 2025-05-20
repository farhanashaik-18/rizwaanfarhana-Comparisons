public class Application {
    public static void main(String[] args) {
        Lab comparisons = new Lab();

        System.out.println(comparisons.isEqual(4, 4));
        System.out.println(comparisons.isEqual(2, 7));
        System.out.println(comparisons.greaterThan(5, 3));
        System.out.println(comparisons.greaterThan(4, 9));
        System.out.println(comparisons.lessThanOrEqualTo(3, 6));
        System.out.println(comparisons.lessThanOrEqualTo(2, 1));
        System.out.println(comparisons.notEqualTo(1, 9));
        System.out.println(comparisons.notEqualTo(8, 8));
    }
}
