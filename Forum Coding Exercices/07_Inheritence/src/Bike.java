public class Bike extends Vehicle{
    protected String frameSize;

    public Bike(float maximumSpeed, float currentSpeed, String manufacturingDate, String frameSize) {
        super(maximumSpeed, currentSpeed, manufacturingDate);
        this.frameSize = frameSize;
    }

    public String getFrameSize() {
        return this.frameSize;
    }
    public void setFrameSize(String frameSize) {
        this.frameSize = frameSize;
    }

    public String getDescription() {
        String description = super.getDescription();
        return description + "\nFrame Size - " + this.frameSize;
    }
}
