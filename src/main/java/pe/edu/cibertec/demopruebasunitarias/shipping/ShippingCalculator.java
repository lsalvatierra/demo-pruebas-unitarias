package pe.edu.cibertec.demopruebasunitarias.shipping;

public class ShippingCalculator {

    public double calculateCost(double weight, String destination) {
        double cost = 5.0;
        if (weight > 10.0) {
            cost += (weight - 10.0) * 2.0;
        }
        if ("Internacional".equalsIgnoreCase(destination)) {
            cost *= 2.0;
        }
        return cost;
    }

}
