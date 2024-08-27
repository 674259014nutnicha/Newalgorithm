import java.util.Scanner;

public class triangleArea {

    public static void main(String[] args) {
        double base,height,triangleArea;
        double length,squareArea;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base: ");

        base=sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();
        triangleArea=0.5*base*height;
        System.out.println("triangleArea="+triangleArea+"square units");
        System.out.println("----------------------");
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        squareArea = length * length;
        System.out.println("squareArea= " + squareArea + " square units");


    }
}