import org.junit.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
//withdraw test
public class WithdrawTest {
    private Withdraw withdraw;

    @Test
    public void TestToString() {
        Date current = Date.from(Instant.now());

        // Tests checking withdraw
        withdraw = new Withdraw(10.23, current, Customer.CHECKING);
        assertEquals("Withdraw of: $" + 10.23 + " Date: " + current + " into account: Checking", withdraw.toString());
        // Tests saving withdraw
        withdraw = new Withdraw(10.23, current, Customer.SAVING);
        assertEquals("Withdraw of: $" + 10.23 + " Date: " + current + " into account: Saving", withdraw.toString());
    }
}