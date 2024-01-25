package bootcam.application;

import bootcam.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        ConnectDatabase("Dani Imdadur","Kepo Bangsat");
        System.out.println("Sukses");
    }
    public static void ConnectDatabase(String username, String password) {
        if (username == null || password == null){
            throw new DatabaseError("Can't connect to data base");
        }
    }
}
