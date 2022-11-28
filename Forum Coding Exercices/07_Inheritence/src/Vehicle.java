public class Vehicle {
    protected float currentSpeed;
    protected float maximumSpeed;
    protected String manufacturingDate;

    public Vehicle(float maximumSpeed, float currentSpeed, String manufacturingDate) {
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = currentSpeed;
        this.manufacturingDate = manufacturingDate;
    }

    public float getCurrentSpeed() {
        return this.currentSpeed;
    }
    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public float getMaximumSpeed() {
        return this.maximumSpeed;
    }
    public void setMaximumSpeed(float maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getManufacturingDate() {
        return this.manufacturingDate;
    }
    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getDescription() {
        return "Maximum Speed - " + this.maximumSpeed + "\nCurrentSpeed - " + this.currentSpeed + "\nManufacturing Date - " + this.manufacturingDate;
    }
}

