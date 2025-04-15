package az.dsa.dsaBackend.exception;

public class TeacherNotFoundException extends RuntimeException {

    public TeacherNotFoundException(Long id) {
        super("Teacher not found with id: " + id);
    }
}
