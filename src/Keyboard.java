abstract class Keyboard {
    int numberOfMonths=12;
    int computerPrice=1000;

    public Keyboard(){}

    public Keyboard(int computerPrice, int numberOfMonths){
        this.numberOfMonths=numberOfMonths;
        this.computerPrice=computerPrice;
    }
    public abstract double monthlyPayments();
    public abstract String financialAdvisor(double salary);

    public double convertComputerWeight(double lb){
        return lb/2.205;
    }
    public String layout(String type){
        if (type.equalsIgnoreCase("qwerty")){
            return "Regular computer";
        }
        else{
            return "Odd computer";
        }
    }
}
