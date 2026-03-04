package OOPsSuperkeyword;

public class Lab176super {
    class Father{
        Father(){
            System.out.println("Father class default constructor");
        }
        int gold=100;
        void home(){
            System.out.println("Father's home");
        }
    }
    class Son extends Father{
        void Bike(){
            System.out.println("Son's bike");
        }
        void NewHome(){
            System.out.println("Son's new home");
            this.home();//invoking parent class method using this keyword
            this.Bike();//invoking child class method using this keyword
            this.NewHome();//invoking child class method using this keyword
            this.gold=200;//accessing parent class variable using this keyword
             System.out.println("Gold: "+this.gold);
             this.home();//invoking parent class method using this keyword
            this.Bike();//invoking child class method using this keyword
             this.NewHome();//invoking child class method using this keyword
        }
        Son(){
            super();//invoking parent class default constructor
            System.out.println("Son class default constructor");
            System.out.println("Gold: "+super.gold);//accessing parent class variable
            super.home();//invoking parent class method
        }
    }
}

