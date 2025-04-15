package az.dsa.dsaBackend.exception;

public class SyllabusNotFoundException extends RuntimeException{
    public SyllabusNotFoundException(Long id) {
        super("Syllabus not found with ID: " + id);
    }
}
