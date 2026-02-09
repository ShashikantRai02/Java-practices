package TernaryOperator;

public class LabAgeclassification {
    public static void main(String[] args) {
        int age = 25;
        String ageGroup = (age < 13) ? "Child" : (age < 20) ? "Teenager" : (age < 60) ? "Adult" : "Senior";
        System.out.println("The age group for age " + age + " is: " + ageGroup);
    }
}
