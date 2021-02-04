import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
//customer test
public class CustomerTest {
    private Customer customer;

    @Before
    public void setup() {
        customer = new Customer("Tyson Sam", 5, 0, 0);
    }
    //deposit test
    @Test
    public void TestDeposit() {
        Date current = Date.from(Instant.now());
        //Tests deposit on checking account and saving account
        assertEquals(25, customer.deposit(25, current, Customer.CHECKING), 0);
        assertEquals(25, customer.deposit(25, current, Customer.SAVING), 0);
        //Tests a deposit that is not an int on checking account and saving account
        assertEquals(125.23, customer.deposit(100.23, current, Customer.CHECKING), 0.23);
        assertEquals(125.23, customer.deposit(100.23, current, Customer.SAVING), 0.23);
    }
    //withdraw test
    @Test
    public void TestWithdraw() {
        Date current = Date.from(Instant.now());
        //Sets Initial balance to $30.23 on checking account and saving account
        customer.deposit(30.23, current, Customer.CHECKING);
        customer.deposit(30.23, current, customer.SAVING);

        // Tests withdraw on checking account and saving account
        assertEquals(15, customer.withdraw(15.23, current, Customer.CHECKING), 0.23);
        assertEquals(15, customer.withdraw(15.23, current, Customer.SAVING), 0.23);
        // Tests a withdraw that makes the balance in checking account and saving account to be negative thats also above the withdraw limit
        assertEquals(-25, customer.withdraw(40, current, Customer.CHECKING), 0.23);
        assertEquals(-25, customer.withdraw(40, current, Customer.SAVING), 0.23);
        // Tests a withdraw that makes a overdraft account on checking account and saving account
        assertEquals(-65, customer.withdraw(40, current, Customer.CHECKING), 0.23);
        assertEquals(-65, customer.withdraw(40, current, Customer.SAVING), 0.23);

    }
}
