package Projects.Project3.com.mile1.exception;

public class NullNameException extends Exception {

    public NullNameException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "name is null";
    }
}
