public class ArrayListExample {

    public static void main(String[] args) {
        String[] names = {"Bob", "John", "Kate", "Lee"};
        int[] numbers = new int[5];

        System.out.println(names[0]); // -> "Bob"
        names[0] = "Bobby";
        System.out.println(names[0]); // -> "Bobby"

        numbers[0] = 1;
        System.out.println(numbers[5]); // -> array index out of bounds
    }

}
