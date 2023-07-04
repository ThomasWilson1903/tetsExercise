import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.name = "sss";
        person1.age = 11;

        person1.speak();
    }

        static class  Person{
        String name;
        int age;
        void  speak(){
            for(int i = 0; i < 3; i++){
                System.out.println(age + name);

            }
        }
    }

}