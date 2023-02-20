import implementation.NoReturnNoInputImpl;
import interfaces.NoReturnNoInput;

public class Main {
    public static void main(String[] args) {
        // Обычная реализация
        NoReturnNoInputImpl noReturnNoInput = new NoReturnNoInputImpl();
        noReturnNoInput.noReturnNoInput();

        //Анонимный класс
        NoReturnNoInput noReturnNoInputAnonymous = new NoReturnNoInput() {
            @Override
            public void noReturnNoInput() {
                System.out.println("Calling an anonymous class noReturnNoInput");
            }
        };
        noReturnNoInputAnonymous.noReturnNoInput();

        //Лямбда
        NoReturnNoInput noReturnNoInputLambda = () -> System.out.println("Lambda");
        noReturnNoInputLambda.noReturnNoInput();

        //Ссылка на метод
        NoReturnNoInput reference = Main::reference;
        reference.noReturnNoInput();
    }

    public static void reference(){
        System.out.println("Calling a method reference");
    }

}