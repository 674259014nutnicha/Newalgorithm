import java.util.Scanner ;
    public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit degree: ");
        float fahrenheit = sc.nextFloat();
        float Celsius = (fahrenheit - 32) * 5/9;
        double roundedcelsius = Math.round(Celsius * 100.0)/100.0;
        System.out.print(fahrenheit +"fahrenheit is equal to "+roundedcelsius);
        sc.close();
        
    }
}

