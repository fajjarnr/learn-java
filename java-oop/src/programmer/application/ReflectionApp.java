package programmer.application;

import programmer.data.CreateUserRequest;
import programmer.utils.ValidationUtils;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("fajar");
        request.setPassword("rahasia");
        request.setName("fajar");

        ValidationUtils.validationReflection(request);
    }
}
