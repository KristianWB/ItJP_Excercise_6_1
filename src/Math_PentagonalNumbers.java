    import java.util.Scanner;

    public class Math_PentagonalNumbers {

        // Building the method to calculate the pentagonalvalue n'times
        public static int getpentagonalNumber(int n) {
            int result = 0;
            for (int i = 0; i <= n; i++ )
                result = i * (3 * i - 1) / 2;

            return result;

        }

        public static void main(String[] args)   {
            Scanner input = new Scanner(System.in);

            // Building the n number userinput til print multiple writings of pentagonalnumbers
            System.out.print("Please, enter the n number for the pentagonalnumber calculation: ");
            int number = input.nextInt();
            // int j = 0;
            int n = 0;
            int k = 0;

            while (n != number) {
                k = k + 10;
                System.out.println();
                while (n < k && n != number) {
                    n++;
                    System.out.print(getpentagonalNumber(n) + " ");
                }
            }

        }
    }
