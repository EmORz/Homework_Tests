import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_1.TwoNumbersFormatToMinuteAndSecond;

public class TwoNumbersFormatToMinuteAndSecondTest {

    @Test
    void isReturnCorrectData(){
        TwoNumbersFormatToMinuteAndSecond toMinuteAndSecond = new TwoNumbersFormatToMinuteAndSecond();
        int a= 10;
        int b = 18;
        String result1 = toMinuteAndSecond.formatedNumsToMinSec(a, b);
        String result2 = toMinuteAndSecond.formatedNumsToMinSec(49, 100);

        Assertions.assertEquals("0:28", result1, "Result is not correct!");
        Assertions.assertEquals("2:29", result2, "Result is not correct!");
    }
}
