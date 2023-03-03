public //--put it all together--//


//Name -
//Date -
//this class will be stored in ForLoops.java

public class ForLoops {

    // print the even numbers from 2 to 40
    public void evens() {

        for (int run = 2; run < 40; run = run + 2) {
            System.out.print("\t" + run);
        }
    }


    // print the squares and cubes of the first 10 positive integers
    public void squaresCubes() {
        for (int cubes = 1; cubes < 11; cubes = cubes + 1) {
            System.out.print("\t" + cubes);
        }
        {


            System.out.print("\n");


        }
        for (int i = 1; i <= 10; i++) {
            int result = i * i;
            System.out.print("\t" + result);
        }
        {


            System.out.print("\n");


        }
        for (int i = 1; i <= 10; i++) {
            int result = i * i * i;
            System.out.print("\t" + result);
        }

    }


    // print out the count of the odd numbers from start to stop
    public void oddNumbers(int start, int stop) {
        int total = 0;
        for (int x = 1; x < 6; x++) {
            total = total + x;
        }

        {
            for (int hey = 100; hey <= 100; hey++)


                System.out.println(hey + " " + total);
        }
    }




    // print the sum of the numbers from start to stop
    public void sum(int start, int stop) {
        int total = 0;
        for (int x = 1; x < 31; x++) {
            total = total + x;

        }
        {
            int h = 0;
            for (int x = 1; x < 201; x++) {
                h = h + x;

            }


            System.out.println(h + " " + total);
        }
        {
        }
    }

    public static void main(String[] args)
    {
        Main test = new Main();
        System.out.println("    Evens");
        test.evens();
        System.out.println("\nSquares and Cubes");
        test.squaresCubes();
        System.out.println("\nNumber of odds");
        test.oddNumbers(1, 30);
        test.oddNumbers(1,200);
        System.out.println("\nSum");
        test.sum(1, 30);
        test.sum(1,200);
        System.out.println();


        System.out.println("Press any key to continue...");


    }
}
 forloop {
    
}
