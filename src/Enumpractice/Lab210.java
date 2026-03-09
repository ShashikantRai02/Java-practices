package Enumpractice;

public class Lab210 {
    public static void main(String[] args) {
        Environment env=Environment.PRODUCTION;// enum variable can hold only one of the predefined constant value
        System.out.println("Environment: " + env);
        System.out.println("URL: " + env.getUrl());
    }
}

