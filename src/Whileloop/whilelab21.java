package Whileloop;

public class whilelab21 {
    public static void main(String[] args) {
        int i = 0;// initialization
        while (i < 10) // condition (Must be true enter into the loop)
        {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;// increment
        }
    }
}
