package programmer.error;

/**
 * Error
 * untuk error yang fatal
 * tidak direkomendasikan menggunakan try catch
 */
public class DatabaseError extends Error{
    public DatabaseError(String message){
        super(message);
    }
}
