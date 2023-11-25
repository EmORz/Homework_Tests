import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_1.Main;

public class MainTest {

    @Test
    void given2PositiveNumbersGivenCorrectPositiveNumbers(){
        //Given
        int x = 2;
        int y = 5;

        //When
        int result = Main.sumNumbers(x, y);
        //Then
        Assertions.assertEquals(7, result,"Sum is not correct!");
    }
}
