package StringBuilderexStringBuffer;

public class Lab92 {
    //write a program for all string function
        public static void main(String[] args) {
            String s1="Hello";
            String s2="World";
            //concat
            String s3=s1.concat(s2);
            System.out.println("Concat: "+s3);// Output: HelloWorld
            //length
            System.out.println("Length of s1: "+s1.length());// Output: 5
            //charAt
            System.out.println("Char at index 1 of s1: "+s1.charAt(1));// Output: e
            //substring
            System.out.println("Substring of s1 from index 1 to 4: "+s1.substring(1,4));// Output: ell
            //toUpperCase
            System.out.println("s1 in uppercase: "+s1.toUpperCase());// Output: HELLO
            //toLowerCase
            System.out.println("s2 in lowercase: "+s2.toLowerCase());// Output: world
            //replace
            System.out.println("s1 after replacing 'l' with 'x': "+s1.replace('l', 'x'));// Output: Hexxo
            //trim
            String s4="   Hello World   ";
            System.out.println("s4 after trim: '"+s4.trim()+"'");// Output: 'Hello World'
            //equals
            System.out.println("s1 equals s2: "+s1.equals(s2));// Output: false
            //equalsIgnoreCase
            System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));// Output: false
            //indexOf
            System.out.println("Index of 'o' in s1: "+s1.indexOf('o'));// Output: 4
            //lastIndexOf
            System.out.println("Last index of 'l' in s1: "+s1.lastIndexOf('l'));// Output: 3
            //startsWith
            System.out.println("s1 starts with 'H': "+s1.startsWith("H"));// Output: true
            //endsWith
            System.out.println("s1 ends with 'o': "+s1.endsWith("o"));// Output: true
            //contains
            System.out.println("s1 contains 'ell': "+s1.contains("ell"));// Output: true
            //split
            String[] parts=s1.split("l");
            System.out.println("s1 split by 'l': ");
            for(String part: parts){
                System.out.println(part);
            }
            //toCharArray
            char[] charArray=s1.toCharArray();

            System.out.println("s1 to char array: ");
            for(char c: charArray){
                System.out.println(c);
            }
        }
}
