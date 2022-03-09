package programmer.data;

/**
 * record
 * untuk menyimpan data dan tidak dapat diubah (immutable)
 */
public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("membuat object login request");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
