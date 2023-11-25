package task_1;
//c. Да се напише метод, който по подадени 2 цели числа - брой секунди
//        връща като резултат String във формат ‘минути:секунди‘.
//        Вход: 10, 18 -> Изход: 0:28
//        Вход 49, 100 -> Изход: 2:29
public class TwoNumbersFormatToMinuteAndSecond {

    public String formatedNumsToMinSec(int a, int b){

        int minutes = (a+b)/60;
        int seconds = (a+b)%60;

        return minutes+":"+seconds;
    }
}
