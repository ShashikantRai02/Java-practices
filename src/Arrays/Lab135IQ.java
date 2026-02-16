package Arrays;
//Mirror right triangle pattern
public class Lab135IQ {
    public static void main(String[] args) {
        int n=5; // Size of the pattern
        for(int i=0;i<n;i++)// Loop through each row
        {
            for(int j=i;j<n;j++)// Loop to print spaces before stars
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)// Loop to print stars in each row
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
