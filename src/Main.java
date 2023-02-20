import implementation.NoReturnNoInputImpl;
import implementation.OneReturnOneInputImpl;
import interfaces.NoReturnNoInput;
import interfaces.OneReturnOneInput;

public class Main {
    public static void main(String[] args) {
        // Обычная реализация
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInput = new NoReturnNoInputImpl();
        noReturnNoInput.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        OneReturnOneInput oneReturnOneInput = new OneReturnOneInputImpl();
        int number = oneReturnOneInput.oneReturnOneInput(10);
        System.out.println(number);

        //Анонимный класс
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInputAnonymous = new NoReturnNoInput() {
            @Override
            public void noReturnNoInput() {
                System.out.println("Calling an anonymous class noReturnNoInput");
            }
        };
        noReturnNoInputAnonymous.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        OneReturnOneInput oneReturnOneInputAnonymous = new OneReturnOneInput() {
            @Override
            public int oneReturnOneInput(int number) {
                return number + number;
            }
        };
        number = oneReturnOneInputAnonymous.oneReturnOneInput(10);
        System.out.println(number);


        //Лямбда
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInputLambda = () -> System.out.println("Lambda");
        noReturnNoInputLambda.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        OneReturnOneInput oneReturnOneInputLambda = n -> n + n * n;
        number = oneReturnOneInputLambda.oneReturnOneInput(10);
        System.out.println(number);

        //Ссылка на метод
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInputReference = Main::NoReturnNoInputReference;
        noReturnNoInputReference.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        OneReturnOneInput oneReturnOneInputReference = Main::OneReturnOneInputReference;
        number = oneReturnOneInputReference.oneReturnOneInput(10);
        System.out.println(number);
    }

    public static void NoReturnNoInputReference(){
        System.out.println("Calling a method reference");
    }
    public static int OneReturnOneInputReference(int number){
        return number * 3;
    }

}