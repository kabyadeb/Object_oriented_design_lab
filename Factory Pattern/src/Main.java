// here we gonna build an factory pattern
// again 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Here We will print something ");
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            ShapeFactory shapeFactory= new ShapeFactory();
            Shape shape1 = shapeFactory.getShape(s);
            shape1.draw();
            System.out.println("Hey I am taking input again. SO tell me what do you want to shape ?: ");
            String s1= scanner.nextLine();
            Shape shape2 = ShapeFactory.getShape(s1);
            shape2.draw();

        }
    }
}
