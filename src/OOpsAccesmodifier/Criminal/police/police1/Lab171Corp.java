package OOpsAccesmodifier.Criminal.police.police1;

public class Lab171Corp {
    public int gun;
    private String idCard;
    public Lab171Corp(int bullet) {
        this.gun = bullet;//assigning the value of bullet to gun
//        this.idCard = idCard;
    }
    protected void canishot()
    {
        System.out.println("Can I shot the criminal? "+gun);
    }
    void thisdefault()
    {
        System.out.println("This is default access modifier");
    }
}
