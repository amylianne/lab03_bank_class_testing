import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankTest {
        private BankAccount bank;

        @BeforeEach
        public void setup() {
            bank = new BankAccount("Amy","Wynn","030499",3457342,200);
        }
        @Test
    public void testDeposit() {
            int expected = 220;
            int actual = bank.deposit(20);
            assertThat(actual).isEqualTo(expected);
           // assertThat(bank.deposit(20)).isEqualTo(220);
        }

        @Test
    public void testWithdrawal() {
            int expected = 100;
            int actual = bank.withdrawal(100);
            assertThat(actual).isEqualTo(expected);
        }
}
