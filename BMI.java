import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double weight,height,BMI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight g: ");

        weight=sc.nextDouble();
        System.out.println("Enter height m: ");
        height=sc.nextDouble();
        BMI = weight/(height*height);
        System.out.println("triangleArea= " + BMI + " square umits");





    }
}
