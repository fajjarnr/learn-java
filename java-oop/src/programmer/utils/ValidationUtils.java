package programmer.utils;

import programmer.annotation.NotBlank;
import programmer.data.LoginRequest;
import programmer.error.BlankException;
import programmer.error.ValidationExeption;

import java.lang.reflect.Field;

public class ValidationUtils {
    public static void validate(LoginRequest loginRequest) throws ValidationExeption, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationExeption("username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationExeption("password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("password is blank");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            // ubah akses menjadi true
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " +field.getName()+ " is blank");
                    }
                }catch (IllegalAccessException exception){
                    System.out.println("tidak dapat mengakses field" + field.getName());
                }
            }
        }
    }
}
