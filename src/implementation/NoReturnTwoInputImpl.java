package implementation;


import interfaces.NoReturnTwoInput;

public class NoReturnTwoInputImpl implements NoReturnTwoInput {
    @Override
    public void noReturnTwoInput(String s1, String s2) {
        System.out.println(s1 + "!!!" + s2);
    }
}
