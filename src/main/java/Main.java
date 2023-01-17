import ru.netology.sqr.Java61.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int mySQR = service.sqrService(200, 700);
        System.out.println(mySQR);
    }
}
