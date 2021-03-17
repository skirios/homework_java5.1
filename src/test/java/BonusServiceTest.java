import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000_60, true);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit2() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        long expected = 500;
        long actual = service.calculate(1_000_000_60, true);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long expected = 1;
        long actual = service.calculate(10_000, false);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit2() {
        BonusService service = new BonusService();
        long expected = 500;
        long actual = service.calculate(5_100_000, false);
        assertEquals(expected, actual);
    }
}
