import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.name = "sss";
        person1.age = 11;

        person1.speak();
        System.out.println(person1.calculateYearsToRetiremeny());
        int ds = 2;
        int dsa = 3;

        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();

        double p = 2*(a+b);
        System.out.println(p);

    }

        static class  Person{
        String name;
        int age;

        int calculateYearsToRetiremeny(){
            int years = 65-age;
            return years;
        }
        void  speak(){
            for(int i = 0; i < 3; i++){
                System.out.println(age + name);

            }
        }
    }

}