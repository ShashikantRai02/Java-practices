package Whileloop;

public class InterviewLab30 {
    public static void main(String[] args) {
        int num = 1;// initialization
        while (num <= 100) // condition
        {
            if (num % 2 == 0) // even number
            {
                System.out.println(num);// print even number
            }
            num++;// increment
        }
    }
}
