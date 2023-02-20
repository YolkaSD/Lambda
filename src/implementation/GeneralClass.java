package implementation;

import interfaces.*;

public class GeneralClass <T> implements
        NoReturnNoInput,
        NoReturnTwoInput,
        ReturnOneInput,
        ReturnTwoInput,
        TReturnTInput<T> {
    @Override
    public void noReturnNoInput() {
        System.out.println("noReturnNoInput GeneralClass");
    }

    @Override
    public void noReturnTwoInput(String s1, String s2) {
        System.out.println("noReturnTwoInput GeneralClass");
    }

    @Override
    public int returnOneInput(int number) {
        return number * 2;
    }

    @Override
    public boolean twoInput(int a, int b) {
        return a > b;
    }

    @Override
    public T tReturnTInput(T t) {
        return t;
    }
}
