package programmer.application;

import programmer.annotation.Fancy;
import programmer.data.LoginRequest;
import programmer.error.ValidationExeption;
import programmer.utils.ValidationUtils;

@Fancy(name = "Validation", tags = {"app", "java"})
public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fajar","rahasia");

        try{
            ValidationUtils.validate(loginRequest);
            System.out.println("data valid");
        }catch (ValidationExeption | NullPointerException error){
            System.out.println("Terjadi error " + error.getMessage());
        }finally {
            System.out.println("selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtils.validateRuntime(loginRequest1);
        System.out.println("success");
    }
}
