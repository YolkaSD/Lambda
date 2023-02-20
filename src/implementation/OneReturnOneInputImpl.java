package implementation;

import interfaces.OneReturnOneInput;

public class OneReturnOneInputImpl implements OneReturnOneInput {

    @Override
    public int oneReturnOneInput(int number) {
        return number * number;
    }
}
