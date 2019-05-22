import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        System.out.println("Filled?");
        System.out.println("1.Filled");
        System.out.println("2.Not Filled");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter side1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3:");
        double side3 = scanner.nextDouble();
        if (choice == 1){
            Triangle triangle = new Triangle(side1,side2,side3);
            triangle.setColor(color);
            triangle.setFilled(true);
            System.out.println(triangle);
        } else {
            Triangle triangle = new Triangle(side1,side2,side3);
            triangle.setColor(color);
            triangle.setFilled(false);
            System.out.println(triangle);
        }
    }
}
