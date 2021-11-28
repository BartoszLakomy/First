package newPackage;

public class Main {
    public static void main(String[] args) {
        String message = "CocaCola";

        int length = message.length();

        System.out.println("Liczba znaków słowa: " + message + " jest równa " + length);

        boolean contains = message.contains("ocaCol");

        System.out.println("Dana fraza zawiera się w słowie " + message + ": " + contains + ".");

        boolean endsWith = message.endsWith("Ola");

        System.out.println("Dana fraza kończy się przekazanym argumentem: " + endsWith + ".");
    }
}
