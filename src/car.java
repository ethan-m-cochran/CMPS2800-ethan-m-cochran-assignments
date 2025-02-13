public class car {
   private String make = "Chevy";
   private String model = "Silverado";
   private int year = 2001;
   private double mileage = 0;
   public double drive (double milesDriven) {
       this.mileage += milesDriven;
       return this.mileage;
   }
   public car () {}
   public String getModel() {
       return this.model;
   }
   public int getYear() {
       return this.year;
   }
   public String getMake() {
       return this.make;
   }
   public car(String make, String model, int year) {
       this.make = make;
       this.model = model;
       this.year = year;
   }
   public static void main (String[] args) {
       car car = new car();
       car previousEthanCar = new car("Toyota","Camry", 1996);
       car currentEthanCar = new car("Hyundai", "VeraCruz", 2011);
       System.out.println("Car (default): " + car.toString());
       System.out.println("Previous Ethan's Car: " + previousEthanCar.toString());
       System.out.println("Current Ethan's Car: " + currentEthanCar.toString());
   }
    public String toString() {
        return "Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year + ", Mileage: " + this.mileage;
    }
}
