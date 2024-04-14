public class Computer extends Keyboard implements Button{
    public Computer(){}
    public Computer(int computerPrice, int numberOfMonths){
        super(computerPrice, numberOfMonths);
    }
    @Override
    public double monthlyPayments(){
        return (computerPrice*1.13)/numberOfMonths;
    }
    @Override
    public String financialAdvisor(double salary){
        if(salary/10<monthlyPayments() || numberOfMonths>MAX_MONTHS){
            return "Consider choosing different computer or financing period";
        }
        else{
            return "This monthly payment is considered OK by banks";
        }
    }
    @Override
    public String systemType(String type){
        return switch (type.toLowerCase()) {
            case ARCHITECTURE -> "You chose the right download link";
            case "x32" -> "Switch to 32-bit version of our program";
            case "macos" -> "Please go to Mac section";
            default -> "Your OS is not supported. Please contact customer service";
        };
    }
    @Override
    public double pixelsPerInch(int length, int width, double diagonal){
        return Math.sqrt(Math.pow(length,2)+Math.pow(width, 2))/diagonal;
    }
}
