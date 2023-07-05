import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner ds = new Scanner(System.in);
        String inputString = ds.nextLine();
        String[] splitString = inputString.split(" ");

        int num = Integer.parseInt(splitString[0]);
        int num1 = Integer.parseInt(splitString[2]);

        switch (splitString[1]){
            case "+":
                System.out.println(new dsa().offers(num,num1));
                break;
            case "-":
                System.out.println(new dsa().subtraction(num,num1));
                break;
            case "*":
                System.out.println(new dsa().multiplication(num,num1));
                break;
            case "/":
                System.out.println(new dsa().division(num,num1));
                break;

            default:
                System.out.println("Error");
                break;
        }

    }

    static class dsa{
    public int offers(int a, int b){

        int s = a+b;
        return s;
    }
    public int subtraction(int a, int b){
        int s = a-b;
        return s;
    }
        public int multiplication(int a, int b){
            int s = a*b;
            return s;
        }
        public int division(int a, int b){
            int s = a/b;
            return s;
        }


    }


}