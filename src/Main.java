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
            if (splitString.length == 3) {

            } else {
                System.out.println(" формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                break;
            }
            if (splitString.length < 3) {

            } else {
                System.out.println("строка не является математической операцией ");
                break;
            }


            if (isNumber(splitString[0])) {
                int num = Integer.parseInt(splitString[0]);
                int num1 = Integer.parseInt(splitString[2]);
                if (num1 <= 10 && num <= 10) {
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
            } else {
                int num = romanToInteger(splitString[0]);
                int num1 = romanToInteger(splitString[2]);
                if (num1 <= 10 && num <= 10) {
                    if (num1 > 0 && num > 0) {
                        switch (splitString[1]) {
                            case "+":
                                String dss = integerToRoman(new dsa().offers(num, num1));
                                System.out.println(dss);
                                break;
                            case "-":
                                System.out.println(integerToRoman(new dsa().subtraction(num, num1)));
                                break;
                            case "*":
                                System.out.println(integerToRoman(new dsa().multiplication(num, num1)));
                                break;
                            case "/":
                                System.out.println(integerToRoman(new dsa().division(num, num1)));
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

    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static int romanToInteger(String romanNum) {
        int result = 0;

        for (int i = 0; i < romanNum.length(); i++) {
            int currentNum = getRomanValue(romanNum.charAt(i));

            if (i + 1 < romanNum.length()) {
                int nextNum = getRomanValue(romanNum.charAt(i + 1));

                if (currentNum < nextNum) {
                    result += nextNum - currentNum;
                    i++;
                } else {
                    result += currentNum;
                }
            } else {
                result += currentNum;
            }
        }

        return result;
    }

    public static String integerToRoman(int num) {
        if (num > 0) {
            String[] romanSymbols = {
                    "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
            };

            int[] arabicValues = {
                    1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
            };

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < arabicValues.length; i++) {
                while (num >= arabicValues[i]) {
                    result.append(romanSymbols[i]);
                    num -= arabicValues[i];
                }
            }
            return result.toString();
        }
        return "в римской системе нет отрицательных чисел";

    }

    public static int getRomanValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


    public static class dsa {
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