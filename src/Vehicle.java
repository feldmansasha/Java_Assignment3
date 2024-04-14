public class Vehicle {

    String color="black";
    public int numberOfDoors=4;
    private boolean gasPowered=true;
    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    public Vehicle(){}
    public Vehicle(String color, int numberOfDoors, boolean gasPowered){
        setGasPowered(gasPowered);
        this.color=color;
        this.numberOfDoors=numberOfDoors;
    }
    public Vehicle(String color){
        this.color=color;
    }
    public Vehicle(String color, int numberOfDoors){
        this.color=color;
        this.numberOfDoors=numberOfDoors;
    }
    public Vehicle(int numberOfDoors, boolean gasPowered){
        this.numberOfDoors=numberOfDoors;
        setGasPowered(gasPowered);
    }
    public boolean ecoFriendly(){
        return numberOfDoors == 2 && !isGasPowered();
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (getClass()!=obj.getClass()) {
            return false;
        }
        Vehicle vehicle=(Vehicle) obj;
        return numberOfDoors==vehicle.numberOfDoors
                && isGasPowered()==vehicle.isGasPowered()
                && color.equals(vehicle.color);
    }
    @Override
    public String toString(){
        return String.format("Color: %s, Number of doors: %d, Gas powered: %b",
                color, numberOfDoors, gasPowered);
    }
}
