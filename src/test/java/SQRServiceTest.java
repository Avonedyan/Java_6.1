import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.Java61.services.SQRService;

public class SQRServiceTest {

    @Test
    public void testPositiveMinAndMax() {
        int expected = 12;
        int actual = SQRService.sqrService(200, 700);
       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeMinAndMax() {
        int expected = 0;
        int actual = SQRService.sqrService(-200, -700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPositiveMinNegativeMax() {
        int expected = 0;
        int actual = SQRService.sqrService(200, -700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeMinPositiveMax() {
        int expected = 17;
        int actual = SQRService.sqrService(-200, 700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEqualMinAndMax() {
        int expected = 1;
        int actual = SQRService.sqrService(100, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        int expected = 0;
        int actual = SQRService.sqrService(0, 0);
        Assertions.assertEquals(expected, actual);
    }
}
