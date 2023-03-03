import java.util.Scanner;
class SumandAvg {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1:");
        double num1 = scanner.nextDouble();

        System.out.println("2:");
        double num2 = scanner.nextDouble();

        double avg = (num1+num2)/2;
        System.out.println("mean is:"+avg);

        double sum = (num1+num2);
        System.out.println("sum is:"+sum);

    }
}


