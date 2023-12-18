public class Main {
    public static void main(String[] args) {
        String one = "Celsius";
        String two = "Fahrenheit";

        System.out.printf("%10s   %10s",one, two);
        for(double i = -100; i <= 100; i++ ){
            System.out.printf("\n%10.2f   %10.2f", i,InputHelper.CtoF(i));
        }
    }
}