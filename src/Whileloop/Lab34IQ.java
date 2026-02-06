package Whileloop;

public class Lab34IQ {
    // write the code to print the numbers from 1 to 100,
    // but for multiples of 3 print "Fizz" instead of the number,
    // and for multiples of 5 print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".
    public static void main(String[] args) {
        int num = 1;//
        while (num <= 100) //condition
        {
            if (num % 3 == 0 && num % 5 == 0) //multiples of both 3 and 5
            {
                System.out.println("FizzBuzz");//
            } else if (num % 3 == 0)// multiples of 3
            {
                System.out.println("Fizz"); // print "Fizz"
            } else if (num % 5 == 0)
            // multiples of 5
                {
                System.out.println("Buzz"); // print "Buzz"
            } else {
                System.out.println(num);// print the number
            }
            num++;// increment
        }
    }
}
