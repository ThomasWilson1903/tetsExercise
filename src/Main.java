import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ds = new Scanner(System.in);
        boolean Error = false;
        while (!Error) {
            System.out.println("Введите выражения через пробел");
            String inputString = ds.nextLine();

            String[] splitString = inputString.split(" ");
            int num = Integer.parseInt(splitString[0]);

            int num1 = Integer.parseInt(splitString[2]);

            if (num1 >= 10 && num <= 10) {
                if (num1 > 0 && num > 0) {
                    switch (splitString[1]) {
                        case "+":
                            System.out.println(new dsa().offers(num, num1));
                            break;
                        case "-":
                            System.out.println(new dsa().subtraction(num, num1));
                            break;
                        case "*":
                            System.out.println(new dsa().multiplication(num, num1));
                            break;
                        case "/":
                            System.out.println(new dsa().division(num, num1));
                            break;

                        default:
                            System.out.println("ошибка оператора вычисления");
                            Error = true;
                            break;
                    }
                } else
                    System.out.println("вводимое число не входит в диапазон вводимых данных");
            } else
                System.out.println("вводимое число не входит в диапазон вводимых данных");

        }

    }

    static class dsa {
        public int offers(int a, int b) {

            int s = a + b;
            return s;
        }

        public int subtraction(int a, int b) {
            int s = a - b;
            return s;
        }

        public int multiplication(int a, int b) {
            int s = a * b;
            return s;
        }

        public int division(int a, int b) {
            int s = a / b;
            return s;
        }



    }


}