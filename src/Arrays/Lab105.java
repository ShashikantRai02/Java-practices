package Arrays;

public class Lab105 {
    public static void main(String[] args) {
        int a=10;
        int  arr[] = {1,2,3,4,5,6,7,8,9,10};
        boolean[] ismarried = {true, false, false, true, false};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        String names="Shashikant";
        String regex = "";
        String[] nameeachelement=names.split(regex); //regex is used to split the string into individual characters
        for (String element : nameeachelement) {
            System.out.print(element);
        }

    }
}
