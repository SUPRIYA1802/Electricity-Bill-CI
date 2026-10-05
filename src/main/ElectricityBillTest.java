import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectricityBillTest {

    @Test
    void testFirstSlab() {
        ElectricityBill bill = new ElectricityBill();
        double amount = bill.calculateBaseAmount(80);
        assertEquals(120.0, amount, 0.001);
    }

    @Test
    void testSecondSlab() {
        ElectricityBill bill = new ElectricityBill();
        double amount = bill.calculateBaseAmount(150);
        assertEquals(250.0, amount, 0.001);
    }

    @Test
    void testThirdSlabWithSurcharge() {
        ElectricityBill bill = new ElectricityBill();
        double total = bill.calculateTotalBill(300);
        assertEquals(682.5, total, 0.001);
    }

    @Test
    void testNoSurcharge() {
        ElectricityBill bill = new ElectricityBill();
        double surcharge = bill.calculateSurcharge(250.0);
        assertEquals(0.0, surcharge, 0.001);
    }
}