public class Main {
    public static void main(String[] args) {
        // Vehicle
        Vehicle v1 = new Vehicle((float) 1.0, (float) 0.8, "2022/10/11");
        System.out.println(v1.getDescription());

        System.out.println(); // Output spacing

        // Car
        Car c1 = new Car((float) 1.0, (float) 0.8, "2022/10/11", "V8");
        System.out.println(c1.getDescription());

        System.out.println(); // Output spacing

        // Bike
        Bike b1 = new Bike((float) 0.5, (float) 0.3, "2022/10/11", "Biggest");
        System.out.println(b1.getDescription());
    }
}