import implementation.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        int number;
        boolean isGreat;
        String string;
        // Обычная реализация
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInput = new NoReturnNoInputImpl();
        noReturnNoInput.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        ReturnOneInput returnOneInput = new OneReturnOneInputImpl();
        number = returnOneInput.returnOneInput(10);
        System.out.println(number);
        //С возвращаемым типом и с двумя входящими параметрами
        ReturnTwoInputImpl returnTwoInput = new ReturnTwoInputImpl();
        isGreat = returnTwoInput.twoInput(3, 4);
        System.out.println(isGreat);
        //Без возвращаемого типа и с двумя входящими параметрами
        NoReturnTwoInput noReturnTwoInput = new NoReturnTwoInputImpl();
        noReturnTwoInput.noReturnTwoInput("Hello", "World");
        //С возвращаемым типом(Т), с одним входящим параметром(Т) и с дженериком Т
        TReturnTInput<String> tReturnTInput = new TReturnTInputImpl<>();
        string = tReturnTInput.tReturnTInput("Hello");
        System.out.println(string);

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
        ReturnOneInput returnOneInputAnonymous = new ReturnOneInput() {
            @Override
            public int returnOneInput(int number) {
                return number + number;
            }
        };
        number = returnOneInputAnonymous.returnOneInput(10);
        System.out.println(number);
        //С возвращаемым типом и с двумя входящими параметрами
        ReturnTwoInput returnTwoInputAnonymous = new ReturnTwoInput() {
            @Override
            public boolean twoInput(int a, int b) {
                return a > b;
            }
        };
        isGreat = returnTwoInputAnonymous.twoInput(6, 3);
        System.out.println(isGreat);
        //Без возвращаемого типа и с двумя входящими параметрами
        NoReturnTwoInput noReturnTwoInputAnonymous = new NoReturnTwoInput() {
            @Override
            public void noReturnTwoInput(String s1, String s2) {
                System.out.println("Anonymous " + s1 + "::" + s2);
            }
        };
        noReturnTwoInputAnonymous.noReturnTwoInput("Hey", "Man");
        //С возвращаемым типом(Т), с одним входящим параметром(Т) и с дженериком Т
        TReturnTInput<Integer> tReturnTInputAnonymous = new TReturnTInput<>() {
            @Override
            public Integer tReturnTInput(Integer integer) {
                return integer * 2;
            }
        };
        number = tReturnTInputAnonymous.tReturnTInput(4);
        System.out.println(number);

        //Лямбда
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInputLambda = () -> System.out.println("Lambda");
        noReturnNoInputLambda.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        ReturnOneInput returnOneInputLambda = n -> n + n * n;
        number = returnOneInputLambda.returnOneInput(10);
        System.out.println(number);
        //С возвращаемым типом и с двумя входящими параметрами
        ReturnTwoInput returnTwoInputLambda = (a, b) -> a < b;
        isGreat = returnTwoInputLambda.twoInput(6, 5);
        System.out.println(isGreat);
        isGreat = returnTwoInputLambda.twoInput(3, 5);
        System.out.println(isGreat);
        //Без возвращаемого типа и с двумя входящими параметрами
        NoReturnTwoInput noReturnTwoInputLambda = (s1, s2) -> System.out.println("Lambda: " + s1 + "||" + s2);
        noReturnTwoInputLambda.noReturnTwoInput("My", "Cat");
        //С возвращаемым типом(Т), с одним входящим параметром(Т) и с дженериком Т
        TReturnTInput<Integer> tReturnTInputLambda = (n) -> n * 10;
        number = tReturnTInputLambda.tReturnTInput(3);
        System.out.println(number);

        //Ссылка на метод
        //Без возвращаемого типа, без входящих параметров
        NoReturnNoInput noReturnNoInputReference = Main::NoReturnNoInputReference;
        noReturnNoInputReference.noReturnNoInput();
        //С возвращаемым типом и с одним входящим параметром
        ReturnOneInput returnOneInputReference = Main::OneReturnOneInputReference;
        number = returnOneInputReference.returnOneInput(10);
        System.out.println(number);
        //С возвращаемым типом и с двумя входящими параметрами
        ReturnTwoInput returnTwoInputReference = Main::twoInputReference;
        isGreat = returnTwoInputReference.twoInput(3, 5);
        System.out.println(isGreat);
        //Без возвращаемого типа и с двумя входящими параметрами
        NoReturnTwoInput noReturnTwoInputReference = Main::noReturnReference;
        noReturnTwoInputReference.noReturnTwoInput("My cat ", "is Beautiful");
        //С возвращаемым типом(Т), с одним входящим параметром(Т) и с дженериком Т
        TReturnTInput<String> reference = Main::tReturnTInput;
        string = reference.tReturnTInput("Reference");
        System.out.println(string);
    }

    public static void NoReturnNoInputReference() {
        System.out.println("Calling a method reference");
    }

    public static int OneReturnOneInputReference(int number) {
        return number * 3;
    }

    public static boolean twoInputReference(int a, int b) {
        return a > b;
    }

    public static void noReturnReference(String s1, String s2) {
        System.out.println("Reference: " + s1 + s2);
    }
    public static <T> T tReturnTInput(T t) {
        return t;
    }


}