public class Main {
    public static void main(String[] args) {
      boolean comparator1 =DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
      boolean comparator2 =DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
      boolean comparator3 =DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
      boolean comparator4 =DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

        System.out.println(comparator1);
        System.out.println(comparator2);
        System.out.println(comparator3);
        System.out.println(comparator4);

    }
}
