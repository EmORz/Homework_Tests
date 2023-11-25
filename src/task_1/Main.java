package task_1;

import java.util.Scanner;

public class Main {
//    b. Да се напише програма, която въвежда n цели числа и изчислява
//    сумата им.

    static int sum =0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N numbers: ");
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {

            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            sumNumbers(number);
        }

        System.out.println("Sum of numbers: "+sum);
    }
    public static int sumNumbers(int n){
        sum+=n;
        return sum;
    }
    public static int sumNumbers(int x, int y){
        return x+y;
    }
}
