package Enumpractice;

enum Environment{
    PRODUCTION("https://api.production.com"), STAGING("https://api.staging.com"), DEVELOPMENT("http://localhost:8080");
    private String url;// instance variable to hold the URL for each environment
    private Environment(String url)// constructor to initialize the URL for each environment
    {
        this.url=url;
    }
    public String getUrl()// method to retrieve the URL for each environment
    {
        return url;
    }
}
