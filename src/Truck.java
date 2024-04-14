import java.util.Objects;

public class Truck extends Vehicle{
    int seats=5;
    public float trunkSpace=500;
    public Truck(){}

    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(String color) {
        super(color);
    }

    public Truck(String color, int numberOfDoors) {
        super(color, numberOfDoors);
    }

    public Truck(int numberOfDoors, boolean gasPowered) {
        super(numberOfDoors, gasPowered);
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats) {
        super(color, numberOfDoors, gasPowered);
        this.seats=seats;
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, float trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.trunkSpace=trunkSpace;
    }
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, float trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats=seats;
        this.trunkSpace=trunkSpace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return seats == truck.seats && Float.compare(trunkSpace, truck.trunkSpace) == 0;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(", Seats: %d, Trunk space: %.1f",
                seats, trunkSpace);
    }

    @Override
    public boolean ecoFriendly() {
        return super.ecoFriendly() && seats<=2 && trunkSpace==0;
    }
}
