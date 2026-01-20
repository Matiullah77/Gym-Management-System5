package InvalidInputException;

// NEW: Custom checked exception class for invalid menu input
public class InvalidInputException extends Exception { // NEW: extends Exception
    public InvalidInputException(String message) {     // NEW: constructor with message
        super(message);                               // NEW: pass message to Exception
    }
}
