package firstLesson;

public class Main {
    public static void main(String[] args) {

        int someNumber = 123;

        boolean result = isBig(someNumber);
        if (result) {
            System.out.println("Liczba jest duza.");
        }
        else {
            System.out.println("Liczba nie jest duza.");
        }

    }

    private static boolean isBig(int someNumber) {
        return someNumber > 200;
    }
}
