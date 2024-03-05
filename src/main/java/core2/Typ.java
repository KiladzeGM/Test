package core2;

public class Typ<T extends Throwable>{

    private T ex = (T) new Exception();

    public void nani() throws T {
        throw ex;
    }

}
