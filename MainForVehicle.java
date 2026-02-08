import java.time.Year;

public class MainForVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle(
                "Honda", "City", 400099,
                "White", "HON983022", "KA01AB1234", Year.of(2021));

        Vehicle v3 = new Vehicle(
                "Toyota", "Innova", 1800000,
                "Silver", "TOY456789", "KA02CD5678", Year.of(2022));

        Vehicle v4 = new Vehicle(
                "Maruti", "Swift", 650000,
                "Red", "MAR112233", "KA03EF9012", Year.of(2019));

        Vehicle v5 = new Vehicle(
                "Tata", "Nexon", 950000,
                "Blue", "TAT998877", "KA04GH3456", Year.of(2023));

        Vehicle v6 = new Vehicle(
                "Mahindra", "XUV700", 2200000,
                "Black", "MAH665544", "KA05IJ7890", Year.of(2024));

        Vehicle[] myfleet = { v1, v2, v3, v4, v5, v6 };

        // Table header
        System.out.println(
            "Brand      Model      Price      Color     MFG Code    Reg No        Year   Distance  FuelUsed  Efficiency");
        System.out.println(
            "-----------------------------------------------------------------------------------------------------------");

        for (Vehicle v : myfleet) {

            v.start(40);
            v.drive(1, 30, 80);

            printVehicleRow(v, 150, 10);

            v.stop();
        }
    }

    public static void printVehicleRow(
            Vehicle v, double distance, double fuelUsed) {

        double efficiency = v.calcTripMileage(distance, fuelUsed);

        System.out.printf(
            "%-10s %-10s %-10.2f %-9s %-11s %-12s %-6s %-9.2f %-9.2f %-10.2f%n",
            v.brandname,
            v.modelname,
            v.price,
            v.color,
            v.mfgCode,
            v.regNo,
            v.mfgYear,
            distance,
            fuelUsed,
            efficiency
        );
    }
}
