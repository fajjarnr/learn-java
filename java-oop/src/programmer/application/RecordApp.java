package programmer.application;

import programmer.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fajar", "123456");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("fajar"));
        System.out.println(new LoginRequest("fajar", "rahasia"));
    }
}
