public class Car extends Vehicle {
    protected String motor;

    public Car(float maximumSpeed, float currentSpeed, String manufacturingDate, String motor) {
        super(maximumSpeed, currentSpeed, manufacturingDate);
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getDescription() {
        String description = super.getDescription();
        return description + "\nMotor - " + this.motor;
    }
}

