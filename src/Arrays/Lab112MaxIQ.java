package Arrays;

public class Lab112MaxIQ {
    public static void main(String[] args) {
        int[] iq = {120, 130, 110, 140, 125};
        int maxIQ = iq[0];//initialize maxIQ with the first element of the array
        for (int i = 1; i < iq.length; i++) //starting from 1 because we have already assigned the first element to maxIQ
        {
                if (iq[i] > maxIQ) //if the current element is greater than the current maximum IQ, update the maximum IQ
                {
                    maxIQ = iq[i];//update the maximum IQ
                }
            }
            System.out.println("Maximum IQ: " + maxIQ);
        }
    }


