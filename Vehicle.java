import java.time.Year;

public class Vehicle {

    public String brandname;
    public String modelname;
    public double price;
    public String color;
    public String mfgCode;
    public String regNo;
    public Year mfgYear;

    // Default constructor
    public Vehicle() {
        brandname = "Hyundai";
        modelname = "i10";
        price = 500000;
        color = "Green";
        mfgCode = "HGY889";
        regNo = "HGY887";
        mfgYear = Year.of(2020);
    }

    // Parameterized constructor
    public Vehicle(String brandName, String modelName, double price,
                   String color, String mfgCode, String regNo, Year year) {
        this.brandname = brandName;
        this.modelname = modelName;
        this.price = price;
        this.color = color;
        this.mfgCode = mfgCode;
        this.regNo = regNo;
        this.mfgYear = year;
    }

    public void start(int speed) {
        System.out.println("Started at speed " + speed);
    }

    public void drive(int gear, int initSp, int tgtSp) {
        System.out.println("Driving...");
    }

    public void stop() {
        System.out.println("Ride stopped\n");
    }

    public double calcTripMileage(double kms, double fuelUsed) {
        if (fuelUsed == 0) return 0;
        return kms / fuelUsed;
    }
}
