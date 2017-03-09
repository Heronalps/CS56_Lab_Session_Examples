// Upper bounded WildCard - Integer, Double

public static double sumOfList(List<? extends Number> list) {
    double s = 0.0;
    for (Number n : list)
        s += n.doubleValue();
    return s;
}
// Unbounded WildCard - Object

public static void printList(List<?> list) {
    for (Object elem: list)
        System.out.print(elem + " ");
    System.out.println();
}
// Lower bounded WildCard - Number, Object 

public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
        list.add(i);
    }
}

public static void main(String[] args) {
	List<Integer> li = Arrays.asList(1, 2, 3);
	System.out.println("sum = " + sumOfList(li));

	List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
	System.out.println("sum = " + sumOfList(ld));
}