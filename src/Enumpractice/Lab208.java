package Enumpractice;

public class Lab208 {
    public static void main(String[] args) {
        Domainurl d=Domainurl.GOOGLE;// enum variable can hold only one of the predefined constant value
        System.out.println("Domain URL: " + d);
        System.out.println("URL for GOOGLE: " + Domainurl.GOOGLE.getUrl());
        System.out.println("URL for FACEBOOK: " + Domainurl.FACEBOOK.getUrl());
        System.out.println("URL for TWITTER: " + Domainurl.TWITTER.getUrl());
    }
}
enum Domainurl{
    GOOGLE("https://www.google.com"),
    FACEBOOK("https://www.facebook.com"),
    TWITTER("https://www.twitter.com");
    private String url;// instance variable to hold the url for each constant
    private Domainurl(String url)// constructor to initialize the url for each constant
    {
        this.url=url;
    }
    public String getUrl()// method to retrieve the url for each constant
    {
        return url;
    }
}
