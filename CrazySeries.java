//Student Name: Cynthia Maroupas Student ID: 261119382
/*In this session, you need to implement the crazy series method. In the crazy series, you will be given a
starting number. Then, you need to times 2 for each number until the number is greater than 100. After
the number is greater than 100, you need to divide 3 until we reach the number is less than 5. Note that
the input number must be greater than 0, and you are not allowed to use loop here.*/
/*____________________________________________________________________________________________________________________*/

import java.util.ArrayList;

public class CrazySeries {

    //static boolean variables to track the state of the recursion
    static boolean isLargerThan100 = false, isSmallerThan5 = false, isStartValue = false;
    public static ArrayList<Double> series = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(crazySeries(10));
        System.out.println(benNumber(3, 5));
    }

    /*Question 2: Ben had difficulty coming out with an assignment question, then he created an odd number called Ben
number, which is the sum of a Ben series. Let x be the starting number and y be the bout number, in the
Ben series, the x should double the value when it is an even number. In contrast, the number should be
subtracted by 1 when x is an odd number. Both x and y should be greater than 0.*/
    static int benNumber(int x, int y) {
        //check if x or y are less than or equal to 0
        if (x <= 0 || y <= 0) {
            return 0;
        }
        int sum = x;

        if (x % 2 == 0) {
            //if x is even, the next number in the series is x*2
            sum += benNumber(x * 2, y - 1);

        } else {
            //if x is odd, the next number in the series is x-1
            sum += benNumber(x - 1, y - 1);
        }
        return sum;
    }

    /**
     * Recursive method that generates a series of numbers based on certain conditions.
     *
     * @param start the starting integer for the series
     * @return the ArrayList containing the series of numbers
     */
    public static ArrayList<Double> crazySeries(double start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Error! Please input a number greater than 0");
        }

        double number = start;

        //add the input number to the series if isStartValue is false

        if (!isStartValue) {
            series.add(number);
        }

        //if the number is less than 100 and isLargerThan100 is false, multiply it by 2

        if (number < 100 && !isLargerThan100) {
            number *= 2;
            //if the number is now greater than or equal to 100, update the conditions and call the method again
            if (number >= 100) {
                isLargerThan100 = true;
                isStartValue = false;
                return crazySeries((double) number);
            }
            return crazySeries((double) number);

        }
        //if the number is greater than 0 and isSmallerThan5 is false, divide it by 3

        else if (number > 0 && !isSmallerThan5) {
            number /= 3.0;


            //if the number is less than 5, update isSmallerThan5 and call the method again
            if (number < 5) {
                isSmallerThan5 = true;
                return crazySeries((double) number);
            }
            return crazySeries((double) number);
        }

        //when the number is less than 5, return the series
        return series;


    }
}