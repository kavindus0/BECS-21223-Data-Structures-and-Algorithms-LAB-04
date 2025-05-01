package Question01.ArrayBased;

public class Test {
    public static void main(String[] args) {
        Functions functions = new Functions(new int[]{15, 22, 7, 13, 8, 6, 19, 20, 4, 17});
        System.out.println("Sum: "+functions.Sum());
        System.out.println("Average: "+functions.Avg());
        System.out.println("Max: "+functions.Max());
        System.out.println("Min: "+functions.Min());
        System.out.println("Count of Evens: "+functions.EvvenCount());


    }
}
