import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_1.Main;

public class MainSumNNumbersTest {
    static int sum =0;
    @Test
    void sumThreeNumbers(){
        int a =9;
        int b = 10;
        int c=10;

        Main.sumNumbers(a);
        Main.sumNumbers(b);


        Assertions.assertEquals(29, Main.sumNumbers(c), "Sum is not correct!");


    }
}
