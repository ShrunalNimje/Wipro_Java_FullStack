package Projects.Project3.com.mile1.exception;

public class NullMarksArrayException extends Exception {

    public NullMarksArrayException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "mark array is null";
    }
}
