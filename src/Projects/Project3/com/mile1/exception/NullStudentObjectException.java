package Projects.Project3.com.mile1.exception;

public class NullStudentObjectException extends Exception {

    public NullStudentObjectException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "object is null";
    }
}
