import java.util.Scanner;

 class Slope {

    public static void main(String[] args) {
        double y1;
        double y2;
        double x1;
        double x2;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter y2");
        y2 = input.nextDouble();

        System.out.println("please enter y1");
        y1 = input.nextDouble();

        System.out.println("please enter x2");
        x2 = input.nextDouble();

        System.out.println("please enter x1");
        x1 = input.nextDouble();

        System.out.println("your answer is " + (y2-y1)/(x2-x1));

    }
}