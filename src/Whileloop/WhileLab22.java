package Whileloop;

public class WhileLab22 {
    public static void main(String[] args) {
        int i = 0; // initialization
        while (i < 10) // condition (Must be true to enter into the loop)
        {
            System.out.println(i);

            if (i == 5) {
                break;
            }
            i++; // increment
        }
    }
}
