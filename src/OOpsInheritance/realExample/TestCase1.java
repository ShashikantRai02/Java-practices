package OOpsInheritance.realExample;

public class TestCase1 extends commonToAllTest {
    public static void main(String[] args) {
        TestCase1 tc1=new TestCase1();
        tc1.startbrowser();
        tc1.openwebsite();
        tc1.closebrowser();
        tc1.readdatabasefile();
        tc1.writeindatabasefile();
        tc1.readExcelfile();
        tc1.sendemail();
        tc1.receiveemail();
        tc1.printdocument();
        tc1.scannerdocument();
        tc1.faxdocument();
    }
}
