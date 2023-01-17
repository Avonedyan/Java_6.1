import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.Java61.services.SQRService;

public class SQRServiceTest {

    @Test
    public void testPositiveXY() {
        SQRService service = new SQRService();
        int expected = 12;
        int actual = service.sqrService(200, 700);
       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeXY() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrService(-200, -700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPositiveXNegativeY() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrService(200, -700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeXPositiveY() {
        SQRService service = new SQRService();
        int expected = 17;
        int actual = service.sqrService(-200, 700);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEqualXY() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrService(100, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrService(0, 0);
        Assertions.assertEquals(expected, actual);
    }
}
