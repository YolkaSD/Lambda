package implementation;

import interfaces.ReturnOneInput;

public class OneReturnOneInputImpl implements ReturnOneInput {

    @Override
    public int returnOneInput(int number) {
        return number * number;
    }
}
