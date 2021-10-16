import java.util.ArrayList;
import java.util.UUID;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
       /* Add the previous 2 numbers in the series
         and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        ArrayList<Integer> holder = new ArrayList<>();
//        System.out.println(n);
        if (n == 0)
            return "0";
        while (n > 0) {
            int remainder = n % 2;
            holder.add(remainder);
            if (n == 1)
                n = 0;
            else
                n = n / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i: holder) {
//            System.out.println(i);
            sb.insert(0, i);
        }
        return sb.toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        UUID uuid = UUID.randomUUID();
        n = n + uuid;
        return n;
    }


}
