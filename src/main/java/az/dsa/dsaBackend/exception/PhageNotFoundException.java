package az.dsa.dsaBackend.exception;

public class PhageNotFoundException extends RuntimeException{
    public PhageNotFoundException(Long id) {
        super("Phage with ID " + id + " not found.");
    }
}
