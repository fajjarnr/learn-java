package programmer.application;

import programmer.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("root", null);
        System.out.println("success");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak dapat connect ke database");
        }
    }
}
