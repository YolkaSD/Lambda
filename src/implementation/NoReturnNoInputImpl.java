package implementation;
import interfaces.NoReturnNoInput;

public class NoReturnNoInputImpl implements NoReturnNoInput{
    @Override
    public void noReturnNoInput() {
        System.out.println("Calling an implemented method noReturnNoInput");
    }
    public void noReturnNoInputReference() {
        System.out.println("Calling  Method Reference");
    }
}
