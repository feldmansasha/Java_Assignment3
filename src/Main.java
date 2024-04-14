public class Main {
    public static void main(String[] args) {
        System.out.println("quiz");
    }
    static void test1(){
        Vehicle car1=new Vehicle("red", 4);
        Vehicle car2=new Vehicle("red", 4);
        Vehicle car3=new Vehicle("blue", 2, false);
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car2.equals(car3));
        Vehicle car4=new Vehicle();
        Vehicle car5=new Vehicle();
        System.out.println(car4.equals(car5));
        System.out.println(car4.equals(car4));
        System.out.println(car2);
        System.out.println(car1.ecoFriendly());
        System.out.println(car3.ecoFriendly());
        System.out.println("Truck class:");
        Truck t1=new Truck();
        Truck t2=new Truck();
        System.out.println(t1.equals(t2));
        Truck t3=new Truck("red", 4, true, 5, 550);
        Truck t4=new Truck("green", 2, false, 2, 0);
        System.out.println("Eco friendly:");
        System.out.println(t3.ecoFriendly());
        System.out.println(t4.ecoFriendly());
    }

        static void test3(){
            Truck t3=new Truck("green", 2, true, 2, 550);
            Truck t4=new Truck("green", 2, true, 52, 550);
            System.out.println("t3 and t4 equal: "+t3.equals(t4));
            System.out.println(t4);

        }
        static void test4(){
        Computer c10=new Computer(2000, 12);
            System.out.println(c10.systemType("MacOS"));
            System.out.println(c10.pixelsPerInch(1920, 1080, 15.6));
            System.out.println(c10.monthlyPayments());
            System.out.println(c10.financialAdvisor(100));
            System.out.println(c10.convertComputerWeight(2.205));
        }
}