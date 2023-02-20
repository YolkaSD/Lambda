package implementation;

import interfaces.TReturnTInput;

public class TReturnTInputImpl <T> implements TReturnTInput<T> {
    @Override
    public T tReturnTInput(T t) {
        return t;
    }
    public T tReturnTInputReference(T t) {
        return t;
    }
}
