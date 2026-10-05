public class ElectricityBill {

    // Calculates baseline amount based on tier rates
    public double calculateBaseAmount(double units) {
        if (units <= 100) {
            return units * 1.50;
        } else if (units <= 200) {
            return (100 * 1.50) + ((units - 100) * 2.00);
        } else {
            return (100 * 1.50) + (100 * 2.00) + ((units - 200) * 3.00);
        }
    }

    // Applies 5% surcharge if total base bill exceeds 500
    public double calculateSurcharge(double amount) {
        if (amount > 500) {
            return amount * 0.05;
        }
        return 0.0;
    }

    // Calculates grand total bill
    public double calculateTotalBill(double units) {
        double base = calculateBaseAmount(units);
        double surcharge = calculateSurcharge(base);
        return base + surcharge;
    }
}