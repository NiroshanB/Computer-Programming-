import org.junit.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
//deposit test
public class DepositTest {
    private Deposit deposit;

    @Test
    public void TestToString() {
        Date current = Date.from(Instant.now());

        // Tests checking deposit
        deposit = new Deposit(10.23, current, Customer.CHECKING);
        assertEquals("Deposit of: $" + 10.23 + " Date: " + current + " into account: Checking", deposit.toString());
        // Tests saving deposit
        deposit = new Deposit(10.23, current, Customer.SAVING);
        assertEquals("Deposit of: $" + 10.23 + " Date: " + current + " into account: Saving", deposit.toString());
    }
}