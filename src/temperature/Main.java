package temperature;

public class Main {

    public static void main(String[] args) {

        int temperature = -2;

        boolean result = isPositive(temperature);
        if (result){
            System.out.println("Temperatura przekazana jako argument jest dodatnia.");
        }
        else{
            System.out.println("Temperatura przekazana jako argument nie jest dodatnia.");
        }

    }

    private static boolean isPositive(int temperature){
        return temperature > 0;
    }

}
